package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {

    @Test
    public void this_should_sound_like_an_owl() {
        FrontTimes frontTimes = new FrontTimes();
        String actual = frontTimes.generateString("Hoolahoop", 4);
        Assert.assertEquals("HooHooHooHoo", actual);
    }
    @Test
    public void short_string_should_sound_like_santa() {
        FrontTimes frontTimes = new FrontTimes();
        String actual = frontTimes.generateString("Ho", 3);
        Assert.assertEquals("HoHoHo", actual);
    }
    @Test
    public void should_not_repeat() {
        FrontTimes frontTimes = new FrontTimes();
        String actual = frontTimes.generateString("Ho", 0);
        Assert.assertEquals("", actual);
    }



}
