package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {

    @Test
    public void stylish_date_should_get_table() {
        DateFashion dateFashion = new DateFashion();
        int actual = dateFashion.getATable(5, 10);
        Assert.assertEquals(2, actual);
    }
    @Test
    public void unstylish_couple_should_not_get_table() {
        DateFashion dateFashion = new DateFashion();
        int actual = dateFashion.getATable(5, 2);
        Assert.assertEquals(0, actual);
    }
    @Test
    public void mid_level_fashionistas_maybe_get_a_table() {
        DateFashion dateFashion = new DateFashion();
        int actual = dateFashion.getATable(5, 5);
        Assert.assertEquals(1, actual);
    }

}
