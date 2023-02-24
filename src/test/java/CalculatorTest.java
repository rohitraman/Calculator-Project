import org.example.implementation.Factorial;
import org.example.implementation.SquareRoot;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void factorialTrueTest() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(factorial.calculate(5), 120.0, 0.01);
    }

    @Test
    public void factorialFalseTest() {
        Factorial factorial = new Factorial();
        Assert.assertNotEquals(factorial.calculate(6), 120.0, 0.01);
    }

    @Test
    public void squareTrueTest() {
        SquareRoot squareRoot = new SquareRoot();
        Assert.assertEquals(squareRoot.calculate(4), 2, 0.01);
    }

    @Test
    public void squareFalseTest() {
        SquareRoot squareRoot = new SquareRoot();
        Assert.assertNotEquals(squareRoot.calculate(5), 3.23, 0.01);
    }
}
