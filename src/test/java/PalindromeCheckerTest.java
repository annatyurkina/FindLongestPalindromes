import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    public void getPalindromeLength_leftEdge_One() {
        Assert.assertEquals(1, PalindromeChecker.getPalindromeLength(0, 0, "abababa"));
    }

    @Test
    public void getPalindromeLength_rightEdge_One() {
        Assert.assertEquals(1, PalindromeChecker.getPalindromeLength(6, 0, "abababa"));
    }

    @Test
    public void getPalindromeLength_oneSymbolPalindrome_One() {
        Assert.assertEquals(1, PalindromeChecker.getPalindromeLength(3, 0, "zzzayyyy"));
    }

    @Test
    public void getPalindromeLength_middle_Seven() {
        Assert.assertEquals(7, PalindromeChecker.getPalindromeLength(3, 0, "abababa"));
    }

    @Test
    public void getPalindromeLength_middleOfPalindrome_Seven() {
        Assert.assertEquals(7, PalindromeChecker.getPalindromeLength(4, 0, "zabababa"));
    }

    @Test
    public void getPalindromeLength_middleOfPalindromeWithOffset_Seven() {
        Assert.assertEquals(7, PalindromeChecker.getPalindromeLength(4, 1, "zabababa"));
    }

    @Test
    public void getPalindromeLength_middleOfNonPalindromeWithOffset_Seven() {
        Assert.assertEquals(7, PalindromeChecker.getPalindromeLength(4, 1, "zabpbrba"));
    }
}
