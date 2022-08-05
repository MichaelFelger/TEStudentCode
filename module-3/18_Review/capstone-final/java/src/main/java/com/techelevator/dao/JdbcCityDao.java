package com.techelevator.dao;

import com.techelevator.model.City;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCityDao implements CityDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcCityDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<City> getCitiesForState(String state) {

        final String sql = "SELECT city_id, city_name, population, area\n" +
                "FROM city\n" +
                "WHERE state_abbreviation = ?;";

        List<City> cities = new ArrayList<>();
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, state);
        while (result.next()) {
            City city = new City(
                    result.getInt("city_id"),
                    result.getString("city_name"),
                    result.getInt("population"),
                    result.getDouble("area")
            );

            cities.add(city);
        }

        return cities;
    }
}
