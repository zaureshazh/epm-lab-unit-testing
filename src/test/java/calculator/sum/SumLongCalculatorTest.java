package calculator.sum;

import calculator.BaseCalculatorTest;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumLongCalculatorTest extends BaseCalculatorTest {

    private long a, b, expected;

    @Factory(dataProvider = "sumLongDataProvider")
    public SumLongCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(testName = "sumLong")
    public void testSumLong() {
        long sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "sumLongDataProvider")
    public static Object[][] sumLongDataProvider() {
        return new Object[][]{
                {100, 84, 184},
                {78, 20, 98}
        };
    }

}
