package at.campus02.zam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationImplTest {

    private Calculator calc;
//    is executed before each test: use it to initialize data
    @BeforeEach
    void setup(){
//        setup phase
        calc = new CalculatorImpl();
    }

    @Test
    void should_add_two_numbers(){
        // EXERCISE PHASE
        double sol = calc.add(42, 68);

        // VERIFY PHASE
        // for double number will be rounded to 0.001 to be compared
        Assertions.assertEquals(110,sol, 0.001);
    }

    @Test
    void should_multiply_two_numbers(){
        Assertions.assertEquals(42,calc.multiply(6,7));
    }
}
