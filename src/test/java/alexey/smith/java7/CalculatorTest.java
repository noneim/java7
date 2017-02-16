package alexey.smith.java7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nn on 16.02.17.
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calc = new Calculator();
        calc.cleanResult();
        calc.add(1,1);
        assertEquals(2,calc.getResult());
    }

}