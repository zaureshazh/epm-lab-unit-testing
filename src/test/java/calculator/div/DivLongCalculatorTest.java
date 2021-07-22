package calculator.div;

import calculator.BaseCalculatorTest;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivLongCalculatorTest extends BaseCalculatorTest {

    private long a, b, expected;

    @Factory(dataProvider = "divLongDataProvider")
    public DivLongCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(testName = "divLong")
    public void testDivLong() {
        long div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }

    @Test(testName = "divByZero", expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        double div = calculator.div(1, 0);
    }

    @DataProvider(name = "divLongDataProvider")
    public static Object[][] divLongDataProvider() {
        return new Object[][]{
                {21, 6, 3},
                {125, 5, 25}
        };
    }

}
