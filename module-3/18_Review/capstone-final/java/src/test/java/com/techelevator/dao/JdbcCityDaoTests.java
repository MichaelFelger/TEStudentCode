package com.techelevator.dao;

import com.techelevator.model.City;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcCityDaoTests extends BaseDaoTests {

    private JdbcCityDao sut;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
         sut = new JdbcCityDao(jdbcTemplate);
    }

    @Test
    public void whenGivenAState_ReturnTheCities() {
        List<City> cities = sut.getCitiesForState("OH");
        Assert.assertNotEquals("there should be data", 0, cities.size());
    }

    @Test
    public void WhenGivenNotAState_ReturnEmptyCollection() {
        List<City> cities = sut.getCitiesForState("XX");
        Assert.assertEquals("there should not be data", 0, cities.size());
    }

}
