package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    @Test
    public void happy_path_should_result_ooleans() {
        NonStart nonStart = new NonStart();
        String actual = nonStart.getPartialString("cool", "beans");
        Assert.assertEquals("ooleans", actual);
    }
    @Test
    public void strings_length_one_should_return_empty() {
        NonStart nonStart = new NonStart();
        String actual = nonStart.getPartialString("a", "b");
        Assert.assertEquals("", actual);
    }
    @Test
    public void null_input_should_still_work() {
        NonStart nonStart = new NonStart();
        String actual = nonStart.getPartialString("HELLO", null);
        Assert.assertEquals("ELLO", actual);
    }


}
