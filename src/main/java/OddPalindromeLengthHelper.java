public class OddPalindromeLengthHelper {

    public static final char SPECIAL_CHAR = '0';

    public static String insertSpecialChar(String inputStr) { // aba --> 0a0b0a0

        if(inputStr == null)
            return null;

        char[] result = new char[inputStr.length() * 2 + 1];
        result[0] = SPECIAL_CHAR;
        int i = 1;

        for(char c : inputStr.toCharArray()) {
            result[i] = c;
            result[i + 1] = SPECIAL_CHAR;
            i+=2;
        }

        return new String(result);
    }

    public static String removeSpecialChar(String inputStr) { // 0a0b0a0 --> aba

        if(inputStr == null)
            return null;

        return inputStr.replace(String.valueOf(SPECIAL_CHAR), "");
    }
}
