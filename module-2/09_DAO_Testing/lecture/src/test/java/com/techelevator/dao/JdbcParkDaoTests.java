package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;

    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        // arrange done already in Spring

        // act
        Park park1Actual = sut.getPark(1);

        // assert
        // Assert.assertEquals("parkIds are different", PARK_1.getParkId(), park1Actual);
        // made helper method down below to keep DRY
        assertParksMatch(PARK_1, park1Actual);
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {

        // arrange done

        // act
        Park parkActual = sut.getPark(9); // give it any integer we know to be not existing

        // assert
        Assert.assertNull("didn't get null when ID found", parkActual);
    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {
        // arrange - set up what I expect to come back
        List<Park> expected = new ArrayList<>();
        expected.add(PARK_1);
        expected.add(PARK_3);
        // act
        List<Park> actual = sut.getParksByState("AA");

        // assert
        // Assert.assertEquals("Didn't get expected parks", expected, actual);
        // we had to override equals in park class to get this to work  - regular equals object compares
        // the location in memory of an object, not the fields of an object

        // loop version - don't forget to assert that size of lists are equal
        Assert.assertEquals("list sizes differ", expected.size(), actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertParksMatch(expected.get(i), actual.get(i));
        }

    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        Assert.fail();
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {
        // arrange - db taken care of some stuff, but we need to make our dummy park
        Park expected = new Park(1000000, "Park4", LocalDate.now(), 3.14, true);
        // act
        Park actual = sut.createPark(expected);
        // assert
        Assert.assertEquals("didn't get expected parkId", 4, actual.getParkId());
        expected.setParkId(4); // now that we know id is ok, we need to update expected
        assertParksMatch(expected, actual);
    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        Assert.fail();
    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        Assert.fail();
    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {
        Assert.fail();
    }

    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals("park ids differ", expected.getParkId(), actual.getParkId());
        Assert.assertEquals("park names differ", expected.getParkName(), actual.getParkName());
        Assert.assertEquals("dates est differ", expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals("areas differ", expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals("has camping differ", expected.getHasCamping(), actual.getHasCamping());
    }

}
