package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;
    private Timesheet testTimesheet;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet actual = sut.getTimesheet(1);
        assertTimesheetsMatch(TIMESHEET_1, actual);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet actual = sut.getTimesheet(-1);
        Assert.assertNull(actual);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> expected = new ArrayList<>();
        expected.add(TIMESHEET_1);
        expected.add(TIMESHEET_2);
        List<Timesheet> actual =sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals("list sizes differ", expected.size(), actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertTimesheetsMatch(expected.get(i), actual.get(i));

        }
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> expected = new ArrayList<>();
        expected.add(TIMESHEET_1);
        expected.add(TIMESHEET_2);
        expected.add(TIMESHEET_3);
        List<Timesheet> actual =sut.getTimesheetsByProjectId(1);
        Assert.assertEquals("list sizes differ", expected.size(), actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertTimesheetsMatch(expected.get(i), actual.get(i));

        }
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        // arrange
        Timesheet expected = new Timesheet(111, 1, 1,
                LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
        // act
        Timesheet actual = sut.createTimesheet(expected);
        // assert
        Assert.assertEquals("didn't get expected parkId", 5, actual.getTimesheetId());
        expected.setTimesheetId(5); // now that we know id is ok, we need to update expected
        assertTimesheetsMatch(expected, actual);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
    Timesheet createdTimesheet = sut.createTimesheet(TIMESHEET_1);

        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrievedTimesheet = sut.getTimesheet(newId);

        assertTimesheetsMatch(createdTimesheet, retrievedTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = sut.getTimesheet(1);

        timesheetToUpdate.setTimesheetId(1);
        timesheetToUpdate.setEmployeeId(2);
        timesheetToUpdate.setProjectId(2);
        timesheetToUpdate.setDateWorked(LocalDate.of(2022, 06, 25));
        timesheetToUpdate.setHoursWorked(44.4);
        timesheetToUpdate.setBillable(false); // might be a problem here
        timesheetToUpdate.setDescription("this is a test");


        sut.updateTimesheet(timesheetToUpdate);

        Timesheet retrievedCity = sut.getTimesheet(1);
        assertTimesheetsMatch(timesheetToUpdate, retrievedCity);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1);

        Timesheet retrievedTimesheet = sut.getTimesheet(1);
        Assert.assertNull(retrievedTimesheet);

//        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(1);
//        Assert.assertEquals(1, timesheets.size());
//        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(0));
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        double expected = 0;
        double actual = sut.getBillableHours(2,2);
        Assert.assertEquals("incorrect total",expected, actual, 0.001);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
