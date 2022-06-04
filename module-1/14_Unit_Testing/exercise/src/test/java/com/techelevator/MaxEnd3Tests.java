package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Tests {

    private MaxEnd3 sut;

    @Before
    public void Setup() {
        sut = new MaxEnd3();
    }

    @Test
    public void should_result_3_3_3() {
        int[] nums = {3,2,1};
        int[] actual = sut.makeArray(nums);
        Assert.assertArrayEquals(new int[]{3, 3, 3}, actual);
    }
    @Test
    public void number_of_the_beast() {
        int[] nums = {1,11,6};
        int[] actual = sut.makeArray(nums);
        Assert.assertArrayEquals(actual, new int[]{6, 6, 6});
    }
    @Test
    public void negative_number_should_still_work() {
        int[] nums = {-5,2,-6};
        int[] actual = sut.makeArray(nums);
        Assert.assertArrayEquals(actual, new int[]{-5,-5,-5});
    }




}
