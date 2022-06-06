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
        // arrange
        int[] temps = {42, 67};

        // act
        int actual = sut.hottestDay(temps);

        // assert
        Assert.assertEquals(67, actual);
    }

    @Test
    public void when_its_cold_outside() {
        // arrange
        int[] temps = {-42, -67};

        // act
        int actual = sut.hottestDay(temps);

        // assert
        Assert.assertEquals(-42, actual);
    }

    @Test
    public void when_duplicate_temps() {
        // arrange
        int[] temps = {32, 56, 32};

        // act
        int actual = sut.hottestDay(temps);

        // assert
        Assert.assertEquals(56, actual);
    }

    @Test
    public void asserting_on_doubles() {
        // arrange
        double one = 1.00;
        double onePlue = 1.008;


        // act

        // assert
        Assert.assertEquals(one, onePlue, 0.00001);
    }

    @Test
    public void asserting_on_arrays() {
        int[] one = {1,2,3};
        int[] two = {3,2,1};

        Assert.assertArrayEquals(one, two);
    }

    @Test
    public void asserting_on_maps() {
        Map<Integer, Integer> one = new HashMap<>();
        one.put(1,1);
        one.put(3,3);
        one.put(2,2);

        Map<Integer, Integer> two = new HashMap<>();
        two.put(1,1);
        two.put(2,2);
        two.put(3,3);


        Assert.assertEquals(one, two);

    }


}
