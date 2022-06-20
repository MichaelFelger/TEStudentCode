import org.junit.Assert;
import org.junit.Test;

public class ElectricBillTests {

    private void assertCorrectBill(double used, double returned, double expected) {
        // arrange
        ElectricBill bill = new ElectricBill();

        // act
        double result = bill.calc(used, returned);

        // assert
        Assert.assertEquals("wrong cost", expected, result, 0.001);
    }

    @Test
    public void whenNormalUsage_returnCost() {
        assertCorrectBill(50, 0, 10);
    }

    @Test
    public void whenHigerNormalUsage_returnCost() {
        assertCorrectBill(60, 0, 12);
    }

    @Test
    public void whenAboveNormalUsage_returnCost() {
        double expected = (100 * 0.2) + (10 * 0.25);
        assertCorrectBill(110, 0, expected);
    }

    @Test
    public void whenReturningToTheGrid_applyDiscount() {
        double expected = ((50-4) * 0.2) * 0.95;
        assertCorrectBill(50, 4, expected);
    }

    @Test
    public void whenReturningMoreThanUsed_applyCredit() {
        double expected = ((110-120) * 0.2);
        assertCorrectBill(110, 120, expected);
    }

}
