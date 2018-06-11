public class PalindromeInfo implements Comparable<PalindromeInfo>  {

    private int index;
    private int length;
    private String input;

    public PalindromeInfo(String input, int index, int length) {
        this.index = index;
        this.length = length;
        this.input = input;
    }

    public boolean contains(int i) {
        if(i <= index)
            return false;
        return i <= getLastIndex();
    }

    public int getMirrorIndex(int i) {
        if(i <= index || getLastIndex()  < i )
            return -1;
        return index - (i - index);
    }

    public int getLastIndex() {
        return index + length / 2;
    }

    @Override
    public int compareTo(PalindromeInfo o) {
        if(this.length > o.length)
            return 1;
        if(this.length < o.length)
            return -1;
        return this.getValue().compareTo(o.getValue());
    }

    @Override
    public String toString() {
        return String.format("Text: %s, Index: %d, Length: %d",
                OddPalindromeLengthHelper.removeSpecialChar(this.getValue()), this.getFirstIndex() / 2, this.length / 2);
    }

    private int getFirstIndex() {
        return index - length / 2;
    }

    private String getValue() {
        return input.substring(this.getFirstIndex(), this.getLastIndex() + 1);
    }
}
