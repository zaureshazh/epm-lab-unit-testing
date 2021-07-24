package calculator.div;

import calculator.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivDoubleCalculatorTest extends BaseCalculatorTest {

    private double a, b, expected;

    @Factory(dataProvider = "divDoubleDataProvider")
    public DivDoubleCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(testName = "divDouble")
    public void testDivDouble() {
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected, 0.0);
    }

    @Test(testName = "divByZero", expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        double div = calculator.div(1, 0);
    }

    @DataProvider(name = "divDoubleDataProvider")
    public static Object[][] divDoubleDataProvider() {
        return new Object[][]{
                {25.5, 5, 5.1},
                {11.22, 11, 1.02}
        };
    }

}
