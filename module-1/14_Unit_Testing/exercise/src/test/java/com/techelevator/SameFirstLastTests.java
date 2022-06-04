package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTests {

    private SameFirstLast sut;

    @Before
    public void Setup() {sut = new SameFirstLast();}

    @Test
    public void length_requirement_met_but_first_and_last_unequal_should_return_false() {
        int[] nums = {1,2,3};
        boolean actual = sut.isItTheSame(nums);
        Assert.assertFalse(actual);
    }
    @Test
    public void length_and_firstlast_both_good_return_true() {
        int[] nums = {1,2,3,1};
        boolean actual = sut.isItTheSame(nums);
        Assert.assertTrue(actual);
    }
    @Test
    public void empty_array_should_return_false() {
        int[] nums = {};
        boolean actual = sut.isItTheSame(nums);
        Assert.assertFalse(actual);
    }

}
