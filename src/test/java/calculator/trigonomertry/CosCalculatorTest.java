package calculator.trigonomertry;

import calculator.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalculatorTest extends BaseCalculatorTest {

    @Test(testName = "cos0", groups = "trigonometry")
    public void cos0() {
        double result = calculator.cos(0);
        Assert.assertEquals(result, 1);
    }

    @Test(testName = "cos60", groups = "trigonometry")
    public void cos60() {
        double result = round(calculator.cos(Math.PI/3));
        Assert.assertEquals(result, 0.5);
    }

    @Test(testName = "cos90", groups = "trigonometry")
    public void cos90() {
        double result = round(calculator.cos(Math.PI/2));
        Assert.assertEquals(result, 0.0);
    }

    private double round(double value) {
        return (double) Math.round(value * 10000d) / 10000d;
    }
}
