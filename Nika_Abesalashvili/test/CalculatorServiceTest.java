import ge.edu.btu.CalculatorService;
import ge.edu.btu.CalculatorServiceImpl;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorServiceTest {
    @Test
    public void currencyTest() {
        CalculatorService calculatorService = new CalculatorServiceImpl();

        assertEquals(30, calculatorService.sum(10, 20));
        assertEquals(60, calculatorService.prod(5, 12));

    }
}
