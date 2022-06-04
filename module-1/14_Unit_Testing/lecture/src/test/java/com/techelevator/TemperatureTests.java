package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TemperatureTests {

    private Temperature sut;

    @Before
    public void Setup() {
        sut = new Temperature();
    }

    @Test
    public void can_find_high_temperature() {
        //arrange - put SUT
        int[] temps = {42, 67,};
        //act
        int actual = sut.hottestDay(temps);
        //assert
        Assert.assertEquals(67, actual);
    }

    @Test
    public void when_its_subzero() {
        //arrange - put SUT
        int[] temps = {-42, -67,};
        //act
        int actual = sut.hottestDay(temps);
        //assert
        Assert.assertEquals(-42, actual);
    }

    @Test
    public void when_duplicate_temps() {
        //arrange - put SUT
        int[] temps = {32, 44, 32};
        //act
        int actual = sut.hottestDay(temps);
        //assert
        Assert.assertEquals( 44, actual);
    }

    @Test
    public void asserting_on_doubles() {
        //arrange
        double one = 1.00;
        double onePlus = 1.000000008;
        //act

        //assert
        Assert.assertEquals(one, onePlus, 0.01);
        //delta is a horseshoes scenario - says if they are equal enough
    }

    @Test
    public void asserting_on_arrays()   {
        int[] one = {1,2,3};
        int[] two = {3,2,1};

        Assert.assertArrayEquals(one, two);  // to pass, array must be same, size, elements, order
    }

    @Test
    public void maps()   {   //might be useful for homework
        Map<Integer, Integer> one = new HashMap<>();
        one.put(1,1);
        one.put(2,2);

        Map<Integer, Integer> two = new HashMap<>();
        two.put(1,1);
        two.put(2,2);

        //Assert.assertEquals may be very specific about what it wants in here
        //requires same keys && same values
        // Assert.assertArrayEquals(one,two); // this is messed up, see lecture final


    }



}
