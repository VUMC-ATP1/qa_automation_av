import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testEverything() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.addition(10, 30), 40);
        Assert.assertEquals(calculator.subtraction(50, 20), 30);
        Assert.assertEquals(calculator.multiplication(5, 4), 20);
        Assert.assertEquals(calculator.division(60, 6), 10);
    }
}
