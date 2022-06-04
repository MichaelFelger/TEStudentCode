package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {

    @Test
    public void has_no_1_or_3_should_return_true() {
        Lucky13 lucky13 = new Lucky13();
        Assert.assertTrue(lucky13.getLucky(new int[]{0, 2, 4}));
    }
    @Test
    public void has_1_and_3_should_return_false() {
        Lucky13 lucky13 = new Lucky13();
        Assert.assertFalse(lucky13.getLucky(new int[]{1,2,3}));
    }
    @Test
    public void has_1_or_3_should_return_false() {
        Lucky13 lucky13 = new Lucky13();
        Assert.assertFalse(lucky13.getLucky(new int[]{1,2,4}));
    }

}
