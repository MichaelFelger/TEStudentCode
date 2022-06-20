
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlarmClockTests {

    private AlarmClock clock;

    @Before
    public void setup() {
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
        assertWakeTime(1, false, "7:00");
    }

    @Test
    public void whenMondayAndOnVacation_return1000() {
        assertWakeTime(1, true, "10:00");
    }

    @Test
    public void whenWed_return700() {
        assertWakeTime(3, false, "7:00");
    }

    @Test
    public void whenFriday_return700() {
        assertWakeTime(5, false, "7:00");
    }

    @Test
    public void whenSat_return700() {
        assertWakeTime(6, false, "10:00");
    }

    @Test
    public void whenSun_return700() {
        assertWakeTime(0, false, "10:00");
    }

    @Test
    public void whenSunAndOnVacation_returnOff() {
        assertWakeTime(0, true, "off");
    }

}
