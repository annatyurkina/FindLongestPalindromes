public class ManachersAlgorithm {

    private static int[] palindromeLengths;

    public static TopUniqueN<PalindromeInfo> analyze(int number, String input) {

        if(input == null || input.isEmpty())
            return null;

        TopUniqueN<PalindromeInfo> topResults = new TopUniqueN<>(number);
        input = OddPalindromeLengthHelper.insertSpecialChar(input); // aba --> 0a0b0a0
        palindromeLengths = new int[input.length()];
        PalindromeInfo lastPalindrome = null;

        for(int i = 0; i < input.length(); i++) {

            palindromeLengths[i] = getLengthOfPalindromeByCenter(input, lastPalindrome, i);

            if(palindromeLengths[i] > 1) { // not a "0"
                PalindromeInfo newPalindrome = new PalindromeInfo(input, i, palindromeLengths[i]);
                topResults.add(newPalindrome);

                if (lastPalindrome == null || lastPalindrome.getLastIndex() < newPalindrome.getLastIndex()) {
                    lastPalindrome = newPalindrome;
                }
            }
        }
        palindromeLengths = null;
        return topResults;
    }

    private static int getLengthOfPalindromeByCenter(String input, PalindromeInfo lastPalindrome, int index) {

        if(lastPalindrome != null && lastPalindrome.contains(index)) {

            int mirrorIndex = lastPalindrome.getMirrorIndex(index);
            int mirrorLength = palindromeLengths[mirrorIndex];
            int prospectivePalindromeEnd = index + mirrorLength / 2;

            if(prospectivePalindromeEnd > lastPalindrome.getLastIndex()) { // we cannot go outside last palindrome
                return 2 * (lastPalindrome.getLastIndex() - index) + 1;
            } else if(prospectivePalindromeEnd < lastPalindrome.getLastIndex()) { // contained inside last palindrome
                return mirrorLength;
            } else { // candidate for new max length, we skip middle of palindrome as we checked it on the left side
                return PalindromeChecker.getPalindromeLength(index, mirrorLength / 2, input);
            }

        }
        else {
            return PalindromeChecker.getPalindromeLength(index, 0, input);
        }
    }
}
