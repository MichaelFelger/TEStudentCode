import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlarmClockTests {

    private AlarmClock clock;

    @Before
    public void Setup() {
        this.clock = new AlarmClock();
    }

    private void assertWakeTime(int day, boolean onVacation, String expected) {
        // act
        String result = clock.getWakeTime(day, onVacation);
        // assert
        Assert.assertEquals("wrong wakeup time", expected, result);
    }

    @Test
    public void whenMonday_return700() {
        assertWakeTime(1,false, "7:00");

    }
    @Test
    public void whenWednesday_return700() {
        // arrange
        // AlarmClock clock = new AlarmClock();
        // act
        // String result = clock.getWakeTime(3, false);
        // assert
        // Assert.assertEquals("wrong wakeup time","7:00", result);
        assertWakeTime(3,false, "7:00");

    }
    @Test
    public void whenFriday_return700() {
        // arrange
        // AlarmClock clock = new AlarmClock();
        // act
        // String result = clock.getWakeTime(5, false);
        // assert
        // Assert.assertEquals("wrong wakeup time","7:00", result);
        assertWakeTime(5,false, "7:00");

    }
    @Test
    public void whenSaturday_return1000() {
        // arrange
        // AlarmClock clock = new AlarmClock();
        // act
        // String result = clock.getWakeTime(6, false);
        // assert
        // Assert.assertEquals("wrong wakeup time","10:00", result);
        assertWakeTime(6,false, "10:00");

    }
    @Test
    public void whenSunday_return1000() {
        // arrange
        // AlarmClock clock = new AlarmClock();
        // act
        // String result = clock.getWakeTime(0, false);
        // assert
        // Assert.assertEquals("wrong wakeup time","10:00", result);
        assertWakeTime(0,false, "10:00");
    }
    @Test
    public void whenMonday_andOnVacation_return1000() {
        assertWakeTime(1,true, "10:00");
    }
    @Test
    public void whenSunday_andOnVacation_return1000() {
        assertWakeTime(0,true, "off");
    }

}
