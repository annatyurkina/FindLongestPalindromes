import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ManachersAlgorithmTest {

    @Test
    public void analize_nullInput_nullResult() {
        Assert.assertNull(ManachersAlgorithm.analyze(3, null));
    }

    @Test
    public void analize_emptyInput_nullResult() {
        Assert.assertNull(ManachersAlgorithm.analyze(3, ""));
    }

    @Test
    public void analize_singleSymbolInput_oneTopResult() {
        Assert.assertEquals("Text: a, Index: 0, Length: 1" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "a").toString());
    }

    @Test
    public void analize_singlePalindromeOfEvenLengthInput_twoResults() {
        Assert.assertEquals("Text: aa, Index: 0, Length: 2" + System.lineSeparator() +
                        "Text: a, Index: 0, Length: 1" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "aa").toString());
    }

    @Test
    public void analize_singlePalindromeOfOddLengthInput_twoResults() {
        Assert.assertEquals("Text: aba, Index: 0, Length: 3" + System.lineSeparator() +
                "Text: a, Index: 0, Length: 1" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "aba").toString());
    }

    @Test
    public void analize_abaab_findsBaab() {
        Assert.assertEquals("Text: baab, Index: 1, Length: 4" + System.lineSeparator() +
                "Text: aba, Index: 0, Length: 3" + System.lineSeparator() +
                "Text: b, Index: 4, Length: 1" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "abaab").toString());
    }

    @Test
    public void analize_abaxabaxabb_findsNineSevenFive() {
        Assert.assertEquals("Text: baxabaxab, Index: 1, Length: 9" + System.lineSeparator() +
                        "Text: abaxaba, Index: 0, Length: 7" + System.lineSeparator() +
                        "Text: baxab, Index: 5, Length: 5" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "abaxabaxabb").toString());
    }

    @Test
    public void analize_sixSameSymbols_findsSixFiveFour() {
        Assert.assertEquals("Text: aaaaaa, Index: 0, Length: 6" + System.lineSeparator() +
                        "Text: aaaaa, Index: 0, Length: 5" + System.lineSeparator() +
                        "Text: aaaa, Index: 0, Length: 4" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "aaaaaa").toString());
    }

    @Test
    public void analize_abaxabaxabybaxabyb_findsNineSevenFive() {
        Assert.assertEquals("Text: baxabybaxab, Index: 5, Length: 11" + System.lineSeparator() +
                        "Text: bybaxabyb, Index: 9, Length: 9" + System.lineSeparator() +
                        "Text: baxabaxab, Index: 1, Length: 9" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "abaxabaxabybaxabyb").toString());
    }

    @Test
    public void analize_ababababa_findsNineSevenFive() {
        Assert.assertEquals("Text: ababababa, Index: 0, Length: 9" + System.lineSeparator() +
                        "Text: abababa, Index: 0, Length: 7" + System.lineSeparator() +
                        "Text: ababa, Index: 0, Length: 5" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "ababababa").toString());
    }

    @Test
    public void analize_aabbaabbaa_findsNineSevenFive() {
        Assert.assertEquals("Text: aabbaabbaa, Index: 0, Length: 10" + System.lineSeparator() +
                        "Text: aabbaa, Index: 0, Length: 6" + System.lineSeparator() +
                        "Text: aa, Index: 0, Length: 2" + System.lineSeparator(),
                ManachersAlgorithm.analyze(3, "aabbaabbaa").toString());
    }
}
