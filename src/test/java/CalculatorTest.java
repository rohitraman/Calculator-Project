import org.example.implementation.Factorial;
import org.example.implementation.NaturalLogarithm;
import org.example.implementation.Power;
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

    @Test
    public void naturalLogTrueTest() {
        NaturalLogarithm naturalLogarithm = new NaturalLogarithm();
        Assert.assertEquals(naturalLogarithm.calculate(21), 3.04, 0.01);
    }

    @Test
    public void powerTrueTest() {
        Power power = new Power();
        Assert.assertEquals(power.calculate(5), 125, 0.01);
    }
    @Test
    public void naturalLogFalseTest() {
        NaturalLogarithm naturalLogarithm = new NaturalLogarithm();
        Assert.assertNotEquals(naturalLogarithm.calculate(21), 3.99, 0.01);
    }

    @Test
    public void powerFalseTest() {
        Power power = new Power();
        Assert.assertNotEquals(power.calculate(5), 64, 0.01);
    }
}
