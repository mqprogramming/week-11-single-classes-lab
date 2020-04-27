import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        assertEquals( 5, calculator.add(2, 3) );
    }

    @Test
    public void subTest() {
        assertEquals( 3, calculator.sub(5, 2) );
    }

    @Test
    public void multiplyTest() {
        assertEquals( 12, calculator.multiply(6, 2) );
    }

    @Test
    public void divTest() {
        assertEquals(5, calculator.div(10, 2), 0.01 );
    }

}
