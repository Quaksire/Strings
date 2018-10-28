package com.quaksire.strings;

import org.junit.Assert;
import org.junit.Test;

public class StringsTest {
    @Test
    public void isEmpty() {
        Assert.assertEquals("", Strings.EMPTY);
    }

    @Test
    public void isNullOrEmpty_isTrue_whenStringIsNull() {
        Assert.assertTrue(Strings.isNullOrEmpty(null));
    }

    @Test
    public void isNullOrEmpty_isTrue_whenStringIsEmpty() {
        Assert.assertTrue(Strings.isNullOrEmpty(""));
    }

    @Test
    public void isNullOrEmpty_isFalse_whenStringIsValid() {
        Assert.assertFalse(Strings.isNullOrEmpty("Hello!"));
    }

    @Test
    public void isBlank_isTrue_whenStringIsEmpty() {
        Assert.assertTrue(Strings.isBlank(""));
    }

    @Test
    public void isBlank_isTrue_whenStringIsNull() {
        Assert.assertTrue(Strings.isBlank(null));
    }

    @Test
    public void isBlank_isFalse_whenStringIsValid() {
        Assert.assertFalse(Strings.isBlank("Hello!"));
    }

    @Test
    public void isBlank_isFalse_whenStringHasMultipleWords() {
        Assert.assertFalse(Strings.isBlank("Hello World!"));
    }
}
