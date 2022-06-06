package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ClockTests {

    @Test
    public void when_not_vacation_and_weekday_return_7am() {
        // arrange
        Clock clock = new Clock();
        boolean vacation = false;
        int tuesday = 2;

        // act
        String actual = clock.alarmClock(tuesday, vacation);

        // assert
        Assert.assertEquals("should be 7am", Clock.SevenAM, actual);
    }

    @Test
    public void when_not_vacation_and_saturday_return_10am() {
        // arrange
        Clock clock = new Clock();
        boolean vacation = false;
        int saturday = 6;

        // act
        String actual = clock.alarmClock(saturday, vacation);

        // assert
        Assert.assertEquals("should be 10am", "10:00", actual);
    }

    @Test
    public void when_not_vacation_and_sunday_return_10am() {
        // arrange
        Clock clock = new Clock();
        boolean vacation = false;
        int sunday = 0;

        // act
        String actual = clock.alarmClock(sunday, vacation);

        // assert
        Assert.assertEquals("should be 10am", "10:00", actual);
    }

//    @Test
    public void when_on_vacation() {
        // arrange
        Clock clock = new Clock();

        Assert.assertEquals("10:00", clock.alarmClock(3, true));
        Assert.assertEquals("off", clock.alarmClock(0, true));
        Assert.assertEquals("off", clock.alarmClock(7, true));
    }

}
