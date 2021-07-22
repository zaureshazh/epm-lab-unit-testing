package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveNegativeCalculatorTest extends BaseCalculatorTest {

    @Test(groups = {"other"})
    public void positiveTrue() {
        Assert.assertTrue(calculator.isPositive(1));
    }

    @Test(groups = {"other"})
    public void positiveFalse() {
        Assert.assertFalse(calculator.isPositive(-1));
    }

    @Test(groups = {"other"})
    public void negativeTrue() {
        Assert.assertTrue(calculator.isNegative(-1));
    }

    @Test(groups = {"other"})
    public void negativeFalse() {
        Assert.assertFalse(calculator.isNegative(1));
    }

}
