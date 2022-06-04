import com.techelevator.Less20;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Tests {


    @Test
    public void edge_case_should_return_true() {
        Less20 less20 = new Less20();
        Assert.assertTrue(less20.isLessThanMultipleOf20(19));
    }
    @Test
    public void edge_case_should_return_false() {
        Less20 less20 = new Less20();
        Assert.assertFalse(less20.isLessThanMultipleOf20(20));
    }
    @Test
    public void not_one_or_two_less_should_return_false() {
        Less20 less20 = new Less20();
        Assert.assertFalse(less20.isLessThanMultipleOf20(11));
    }


}
