import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private Operator operator;
    private static final Logger logger = LogManager.getLogger(Calculator.class);


    public Calculator() {
        logger.debug("Calculator was created!");

    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void reset() {

        System.out.println("Clear all...");
        System.out.println("0");

    }


}
