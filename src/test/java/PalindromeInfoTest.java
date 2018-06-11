import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PalindromeInfoTest {

    @Test
    public void toString_givesDesiredString() {
        PalindromeInfo pi = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("abababa"), 11, 7);

        Assert.assertEquals("Text: aba, Index: 4, Length: 3", pi.toString());
    }

    @Test
    public void compareTo_lengthLess_returnsNegative() {
        PalindromeInfo ps1 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("abababa"), 100, 7);
        PalindromeInfo ps2 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("abababa"), 100, 6);

        Assert.assertTrue(ps2.compareTo(ps1) < 0);
    }

    @Test
    public void compareTo_lengthGreater_returnsPositive() {
        PalindromeInfo ps1 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("abababa"), 100, 7);
        PalindromeInfo ps2 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("abababa"), 100, 8);

        Assert.assertTrue(ps2.compareTo(ps1) > 0);
    }

    @Test
    public void compareTo_lengthSameValueLess_returnsNegative() {
        PalindromeInfo ps1 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("hbababh"), 7, 14);
        PalindromeInfo ps2 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("abababa"), 7, 14);

        Assert.assertTrue(ps2.compareTo(ps1) < 0);
    }

    @Test
    public void compareTo_lengthSameValueGreater_returnsPositive() {
        PalindromeInfo ps1 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("hbababh"), 7, 14);
        PalindromeInfo ps2 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("zbababz"), 7, 14);

        Assert.assertTrue( ps2.compareTo(ps1) > 0);
    }

    @Test
    public void compareTo_lengthSameValueSame_returnsZero() {
        PalindromeInfo ps1 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("abababa"), 7, 14);
        PalindromeInfo ps2 = new PalindromeInfo(OddPalindromeLengthHelper.insertSpecialChar("abababa"), 7, 14);

        Assert.assertEquals(0, ps2.compareTo(ps1));
    }

    @Test
    public void contains_isInTheMiddle_true() {
        Assert.assertTrue(new PalindromeInfo("pppababadd",5,5).contains(6));
    }

    @Test
    public void contains_isOnTheEdge_true() {
        Assert.assertTrue(new PalindromeInfo("pppababadd",5,5).contains(7));
    }

    @Test
    public void contains_isOutside_false() {
        Assert.assertFalse(new PalindromeInfo("pppababadd",5,5).contains(8));
    }

    @Test
    public void getMirrorIndex_isInTheMiddle_true() {
        Assert.assertEquals(4 ,new PalindromeInfo("pppababadd",5,5).getMirrorIndex(6));
    }

    @Test
    public void getMirrorIndex_isOnTheEdge_true() {
        Assert.assertEquals(3 ,new PalindromeInfo("pppababadd",5,5).getMirrorIndex(7));
    }

    @Test
    public void getLastIndex() {
        Assert.assertEquals(7 ,new PalindromeInfo("pppababadd",5,5).getLastIndex());
    }
}
