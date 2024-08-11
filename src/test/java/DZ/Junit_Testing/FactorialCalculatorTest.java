package DZ.Junit_Testing;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(FactorialCalculator.calculateFactorial(0), 1);
        assertEquals(FactorialCalculator.calculateFactorial(1), 1);
        assertEquals(FactorialCalculator.calculateFactorial(2), 2);
        assertEquals(FactorialCalculator.calculateFactorial(3), 6);
        assertEquals(FactorialCalculator.calculateFactorial(4), 24);
        assertEquals(FactorialCalculator.calculateFactorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialWithNegativeNumber() {
        FactorialCalculator.calculateFactorial(-1);
    }
}


