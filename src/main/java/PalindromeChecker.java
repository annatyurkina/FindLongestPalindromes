public class PalindromeChecker {

    public static int getPalindromeLength(int index, int offset, String input) {

        if(input.length() == index + 1 || index == 0) {
            return 1;
        }

        // offset > 0 --> we do not re-check middle of palindrome
        int i = index - offset;
        int j = index + offset;
        int length = 1 + 2 * offset;

        while(--i >= 0 && ++j < input.length()) {
            if(input.charAt(i) != input.charAt(j)) {
                break;
            }
            length+=2;
        }

        return length;
    }

}
