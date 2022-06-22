package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }  // this is how all of our methods have a way to talk to database and pass in SQL

    @Override
    public Park getPark(int parkId) {
        String selectPark = "SELECT park_id, park_name, date_established, area, has_camping FROM park WHERE park_id = ?";
        SqlRowSet parkRowSet = jdbcTemplate.queryForRowSet(selectPark, parkId);
        if (parkRowSet.next()) {
            Park park = new Park();

            park.setParkId(parkRowSet.getInt("park_id"));
            park.setParkName(parkRowSet.getString("park_name"));

            if (parkRowSet.getDate("date_established") != null) {
                park.setDateEstablished(parkRowSet.getDate("date_established").toLocalDate());
            } else {
                park.setDateEstablished(null);
            }
            // or like this
            Date dateEst = parkRowSet.getDate("date_established");
            park.setDateEstablished(dateEst == null ? null : dateEst.toLocalDate());

            park.setArea(parkRowSet.getDouble("area"));
            park.setHasCamping(parkRowSet.getBoolean("has_camping"));

            return park;
        } else {
            return null;
        }
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        String selParksByState =
                "SELECT park.park_id, park_name, date_established, area, has_camping " +
                        " FROM " +
                        " park" +
                        " JOIN park_state ON park.park_id = park_state.park_id" +
                        " WHERE" +
                        " state_abbreviation = ? ";
        SqlRowSet parksRowSet = jdbcTemplate.queryForRowSet(selParksByState, stateAbbreviation);
        // make a variable to protect scope
        List<Park> parks = new ArrayList<>();

        while (parksRowSet.next()) {
            parks.add(mapRowToPark(parksRowSet));
        }

        return parks;
    }

    @Override  //  Example of ILIKE search
    public List<Park> searchParksByName (String name) {
        String searchPark =
                "SELECT * FROM park WHERE park_name ILIKE ? ORDER BY park_name;";

        String wildcardedSearch = "%" + name + "%";
        // normally would not use * or park_name, would bind
        List<Park> parks = new ArrayList<>();

        SqlRowSet parksRowSet = jdbcTemplate.queryForRowSet(searchPark, wildcardedSearch);

        while (parksRowSet.next()) {
            Park park = mapRowToPark(parksRowSet);
            parks.add(park);
        } return parks;
    }

    @Override
    public Park createPark(Park park) {
        String createPark =
                "INSERT INTO park(park_name, date_established, area, has_camping)" +
                        " VALUES (?, ?, ?, ?)" +
                        " RETURNING park_id;";

        int newParkId = jdbcTemplate.queryForObject(createPark, Integer.class, park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping());

//        park.setParkId(newParkId);
//
//        return park;
        return getPark(newParkId);
    }

    @Override
    public void updatePark(Park park) {
        String updatePark =
                "UPDATE park SET park_name = ?, date_established = ?," +
                        " area = ?, has_camping = ? WHERE park_id = ?;";
        int numUpdated = jdbcTemplate.update(updatePark, park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping(), park.getParkId());
        if (numUpdated == 0) {
            System.err.println("couldn't update" + park.getParkId());
        }
    }

    @Override
    public void deletePark(int parkId) {

    }

    @Override
    public void addParkToState(int parkId, String stateAbbreviation) {

    }

    @Override
    public void removeParkFromState(int parkId, String stateAbbreviation) {

    }

    private Park mapRowToPark(SqlRowSet parkRowSet) {
        Park park = new Park();

        park.setParkId(parkRowSet.getInt("park_id"));
        park.setParkName(parkRowSet.getString("park_name"));

        if (parkRowSet.getDate("date_established") != null) {
            park.setDateEstablished(parkRowSet.getDate("date_established").toLocalDate());
        } else {
            park.setDateEstablished(null);
        }

        park.setArea(parkRowSet.getDouble("area"));
        park.setHasCamping(parkRowSet.getBoolean("has_camping"));

        return park;
    }
}
