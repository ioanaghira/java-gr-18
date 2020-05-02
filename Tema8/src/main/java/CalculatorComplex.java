import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorComplex {
    private static final Logger logger = LogManager.getLogger(CalculatorComplex.class);
    private Operator simpleOperator;
    private Operator operatorInsideParenthesis;

    public CalculatorComplex() {
        logger.debug("ComplexCalculator was created!");
    }

    public Operator getSimpleOperator() {
        return simpleOperator;
    }

    public void setSimpleOperator(Operator simpleOperator) {
        this.simpleOperator = simpleOperator;
    }


    public void setOperatorInsideParenthesis(Operator operatorInsideParenthesis) {
        this.operatorInsideParenthesis = operatorInsideParenthesis;
    }

    public int doParentheses (Number beforeParenthesis, Number first, Number second) throws DivideBy1MilException {

        Number result = operatorInsideParenthesis.calculate(first, second);

        Number finalResult = simpleOperator.calculate(beforeParenthesis, result);

        return finalResult.intValue();

    }

    public void reset() {

        System.out.println("Clear all...");
        System.out.println("0");

    }
}
