import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class OddPalindromeLengthHelperTest {

    @Test
    public void insertSpecialChar_nullInput_returnsNull(){
        Assert.assertNull(OddPalindromeLengthHelper.insertSpecialChar(null));
    }

    @Test
    public void insertSpecialChar_emptyInput_returnsOneCharString(){
        Assert.assertEquals("0", OddPalindromeLengthHelper.insertSpecialChar(""));
    }

    @Test
    public void insertSpecialChar_oneCharInput_returnsThreeCharString(){
        Assert.assertEquals("0a0", OddPalindromeLengthHelper.insertSpecialChar("a"));
    }

    @Test
    public void insertSpecialChar_evenCharInput_returnsTwoTimesPlusOneCharString(){
        Assert.assertEquals("0a0b0c0d0e0f0", OddPalindromeLengthHelper.insertSpecialChar("abcdef"));
    }

    @Test
    public void insertSpecialChar_oddCharInput_returnsTwoTimesPlusOneCharString(){
        Assert.assertEquals("0a0b0c0d0e0", OddPalindromeLengthHelper.insertSpecialChar("abcde"));
    }

    @Test
    public void removeSpecialChar_nullInput_returnsNull(){
        Assert.assertNull(OddPalindromeLengthHelper.removeSpecialChar(null));
    }

    @Test
    public void removeSpecialChar_emptyInput_returnsOneCharString(){
        Assert.assertEquals("", OddPalindromeLengthHelper.removeSpecialChar("0"));
    }

    @Test
    public void removeSpecialChar_oneCharInput_returnsThreeCharString(){
        Assert.assertEquals("a", OddPalindromeLengthHelper.removeSpecialChar("0a0"));
    }

    @Test
    public void removeSpecialChar_evenCharInput_returnsTwoTimesPlusOneCharString(){
        Assert.assertEquals("abcdef", OddPalindromeLengthHelper.removeSpecialChar("0a0b0c0d0e0f0"));
    }

    @Test
    public void removeSpecialChar_oddCharInput_returnsTwoTimesPlusOneCharString(){
        Assert.assertEquals("abcde", OddPalindromeLengthHelper.removeSpecialChar("0a0b0c0d0e0"));
    }
}
