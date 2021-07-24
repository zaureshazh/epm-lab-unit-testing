package calculator.mult;

import calculator.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultDoubleCalculatorTest extends BaseCalculatorTest {

    private double a, b, expected;

    @Factory(dataProvider = "multDoubleDataProvider")
    public MultDoubleCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(testName = "multDouble")
    public void testMultDouble() {
        double mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected, 0.0);
    }

    @DataProvider(name = "multDoubleDataProvider")
    public static Object[][] multDoubleDataProvider() {
        return new Object[][]{
                {10.2, 2.5, 25},
                {0.25, 17.15, 4}
        };
    }

}
