package calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PowCalculatorTest extends BaseCalculatorTest {

    private double a, b, expected;

    @Factory(dataProvider = "powDataProvider")
    public PowCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(groups = {"other"}, testName = "pow")
    public void testPow() {
        double pow = calculator.pow(a, b);
        Assert.assertEquals(pow, expected, 0.0);
    }

    @DataProvider(name = "powDataProvider")
    public static Object[][] powDataProvider() {
        return new Object[][]{
                {2, 4, 16},
                {25, 3, 15625}
        };
    }

}
