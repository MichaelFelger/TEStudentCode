package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ClockTests {


// have a look at lecture final for some other good examples, like introducing constants to narrow possible errors


    @Test
    public void when_not_vaction_and_not_weekend_return_7am() {
        //arrange
        Clock clock = new Clock();
        boolean vacation = false;
        int tuesday = 2;
        //act
        String actual = clock.alarmClock(tuesday, vacation);
        //assert
        Assert.assertEquals("should be 7am", "7:00", actual);
    }
    @Test
    public void when_not_vacation_and_is_saturday_return_10am() {
        //arrange
        Clock clock = new Clock();
        boolean vacation = false;
        int saturday = 6;
        //act
        String actual = clock.alarmClock(saturday, vacation);
        //assert
        Assert.assertEquals("should be 10am", "10:00", actual);
    }
    @Test
    public void when_not_vacation_and_is_sunday_return_10am() {
        //arrange
        Clock clock = new Clock();
        boolean vacation = false;
        int sunday = 0;
        //act
        String actual = clock.alarmClock(sunday, vacation);
        //assert
        Assert.assertEquals("should be 10am", "10:00", actual);
    }
    @Test
    public void when_on_vaction_and_not_weekend_return_10am() {
        //arrange
        Clock clock = new Clock();
        boolean vacation = true;
        int tuesday = 2;
        //act
        String actual = clock.alarmClock(tuesday, vacation);
        //assert
        Assert.assertEquals("should be 10am", "10:00", actual);
    }



}
