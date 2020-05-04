import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
    public void calculate() {
        Calculator calc = new Calculator();
        calc.setOperator(Operator.valueOf("DIVIDE"));

        Assertions.assertThrows(DivideBy1MilException.class, () -> calc.getOperator().calculate(5, 1000000));


    }
}
