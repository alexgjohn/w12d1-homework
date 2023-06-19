import com.codeclan.example.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void canSubtract(){
        int result = calculator.subtract(8, 2);
        assertEquals(6, result);
    }

    @Test
    public void canMultiply(){
        int result = calculator.multiply(5, 4);
        assertEquals(20, result);
    }

    @Test
    public void canDivide(){
        double result = calculator.divide(30, 5);
        assertEquals(6, result, 0.0);
    }

}
