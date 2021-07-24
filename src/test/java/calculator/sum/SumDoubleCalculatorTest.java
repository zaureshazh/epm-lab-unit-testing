package calculator.sum;

import calculator.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumDoubleCalculatorTest extends BaseCalculatorTest {

    private double a, b, expected;

    @Factory(dataProvider = "sumDoubleDataProvider")
    public SumDoubleCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(testName = "sumDouble")
    public void testSumDouble() {
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected, 0.0);
    }

    @DataProvider(name = "sumDoubleDataProvider")
    public static Object[][] sumDoubleDataProvider() {
        return new Object[][]{
                {13.2, 12.5, 25.7},
                {100.23, 15.36, 115.59}
        };
    }

}
