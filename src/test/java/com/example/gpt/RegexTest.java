package com.example.gpt;

import org.junit.Assert;
import org.junit.Test;

public class RegexTest {
    private static final String regex = "[a-zA-Z\\-\\.\\s]*";

    @Test
    public void testRegex() {
        Assert.assertTrue("abc-def.ghi ijk ".matches(regex));
        Assert.assertTrue("abcdefghijk".matches(regex));
        Assert.assertTrue("".matches(regex));
        Assert.assertTrue("vinny using chaGPT -- Awesome.".matches(regex));
        Assert.assertFalse("abc-def.ghi ijk123".matches(regex));
    }
}

