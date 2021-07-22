package calculator.trigonomertry;

import calculator.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalculatorTest extends BaseCalculatorTest {

    @Test(testName = "ctg45", groups = "trigonometry")
    public void ctg45() {
        double result = round(calculator.ctg(Math.PI/4));
        Assert.assertEquals(result, 1.0);
    }

    @Test(groups = {"trigonometry"})
    public void ctg90() {
        double result = round(calculator.ctg(Math.PI/2));
        Assert.assertEquals(result, 0.0);
    }

    private double round(double value) {
        return (double) Math.round(value * 10000d) / 10000d;
    }

}
