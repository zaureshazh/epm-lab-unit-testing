package calculator.mult;

import calculator.BaseCalculatorTest;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultLongCalculatorTest extends BaseCalculatorTest {

    private long a, b, expected;

    @Factory(dataProvider = "multLongDataProvider")
    public MultLongCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(testName = "multLong")
    public void testMultLong() {
        long mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

    @DataProvider(name = "multLongDataProvider")
    public static Object[][] multLongDataProvider() {
        return new Object[][]{
                {10, 25, 250},
                {25, 17, 425}
        };
    }

}
