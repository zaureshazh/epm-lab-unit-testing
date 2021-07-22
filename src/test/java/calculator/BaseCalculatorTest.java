package calculator;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseCalculatorTest {
    protected Calculator calculator;

    @BeforeClass
    public void setUp() {
        System.out.println("Test started");
        calculator = new Calculator();
    }

    @AfterClass
    public void finish() {
        System.out.println("Test completed");
    }
}
