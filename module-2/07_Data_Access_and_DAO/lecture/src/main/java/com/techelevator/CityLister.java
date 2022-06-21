package com.techelevator;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.JdbcTransactionObjectSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class CityLister {

    public static void main(String[] args) {
        // first thing we need is a datasource
        BasicDataSource usaDataSource = new BasicDataSource();
        // where's the server? what database on that server? what are my credentials?
        usaDataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        //                      ^driver^         ^where^ ^port^  ^DBname^ <- case sensitive
        usaDataSource.setUsername("postgres");
        usaDataSource.setPassword("postgres1");

        // now make JDBC Template off the datasource
        JdbcTemplate jdbcTemplate = new JdbcTemplate(usaDataSource);
        String selCities = "SELECT city_name, population AS num_folks" +
                " FROM city " +
                " WHERE state_abbreviation = ? AND population > ? " +
                " ORDER BY city_name";
                //                                      fill in infinite placeholders below
        SqlRowSet cities =  jdbcTemplate.queryForRowSet(selCities, "OH", 100000);

        // SqlRowSet
        while (cities.next()) {
            String city = cities.getString("city_name");
            int population = cities.getInt("num_folks");  // <<-- notice use of alias ^^
            System.out.println(city + " " + population);
        }
    }
}
