package calculator;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SqrtCalculatorTest extends BaseCalculatorTest{

    private double a, expected;

    @Factory(dataProvider = "sqrtDataProvider")
    public SqrtCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test(groups = {"other"}, testName = "sqrt")
    public void testSqrt() {
        double sqrt = calculator.sqrt(a);
        Assert.assertEquals(sqrt, expected, 0.0);
    }

    @DataProvider(name = "sqrtDataProvider")
    public static Object[][] sqrtDataProvider() {
        return new Object[][]{
                {16, 4},
                {625, 25}
        };
    }

}
