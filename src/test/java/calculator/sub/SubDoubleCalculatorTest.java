package calculator.sub;

import calculator.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubDoubleCalculatorTest extends BaseCalculatorTest {

    private double a, b, expected;

    @Factory(dataProvider = "subDoubleDataProvider")
    public SubDoubleCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(testName = "subDouble")
    public void testSubDouble() {
        double sub = Math.floor(calculator.sub(a, b));
        Assert.assertEquals(sub, expected, 0.0);
    }

    @DataProvider(name = "subDoubleDataProvider")
    public static Object[][] subDoubleDataProvider() {
        return new Object[][]{
                {5.1, 1.2, 3},
                {10.2, 2.5, 7}
        };
    }

}
