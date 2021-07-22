package calculator.trigonomertry;

import calculator.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalculatorTest extends BaseCalculatorTest {

    @Test(testName = "sin0", groups = "trigonometry")
    public void sin0() {
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0.0);
    }

    @Test(testName = "sin30", groups = "trigonometry")
    public void sin30() {
        double result = round(calculator.sin(Math.PI/6));
        Assert.assertEquals(result, 0.5);
    }

    @Test(testName = "sin45", groups = "trigonometry")
    public void sin45() {
        double result = round(calculator.sin(Math.PI/4));
        Assert.assertEquals(result, 0.7071);
    }

    private double round(double value) {
        return (double) Math.round(value * 10000d) / 10000d;
    }
}
