package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {

    @Test
    public void true_if_returns_only_zeroes() {
        StringBits stringBits = new StringBits();
        String actual = stringBits.getBits("010203040506070809");
        Assert.assertEquals("000000000", actual);
    }
    @Test
    public void input_null_returns_empty_string() {
        StringBits stringBits = new StringBits();
        String actual = stringBits.getBits(null);
        Assert.assertEquals("", actual);
    }
    @Test
    public void single_char_check_should_still_work() {
        StringBits stringBits = new StringBits();
        String actual = stringBits.getBits(" ");
        Assert.assertEquals(" ", actual);
    }

}
