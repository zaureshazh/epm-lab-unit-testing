package calculator.sub;

import calculator.BaseCalculatorTest;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubLongCalculatorTest extends BaseCalculatorTest {

    private long a, b, expected;

    @Factory(dataProvider = "subLongDataProvider")
    public SubLongCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(testName = "subLong")
    public void testSubLong() {
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }

    @DataProvider(name = "subLongDataProvider")
    public static Object[][] subLongDataProvider() {
        return new Object[][]{
                {100, 15, 85},
                {23, 14, 9}
        };
    }

}
