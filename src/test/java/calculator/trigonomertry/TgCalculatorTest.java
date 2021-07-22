package calculator.trigonomertry;

import calculator.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalculatorTest extends BaseCalculatorTest {

    @Test(testName = "tg0", groups = "trigonometry")
    public void tg0() {
        double result = round(calculator.tg(0));
        Assert.assertEquals(result, 0.0);
    }

    @Test(testName = "tg45", groups = "trigonometry")
    public void tg45() {
        double result = round(calculator.tg(Math.PI/4));
        Assert.assertEquals(result, 1.0);
    }

    private double round(double value) {
        return (double) Math.round(value * 10000d) / 10000d;
    }
}
