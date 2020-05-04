import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {


        Calculator calc1 = new Calculator();

        calc1.setOperator(Operator.valueOf("ADDITION"));

        try {
            System.out.println(calc1.getOperator().calculate(15, 10));
            logger.info(calc1.getOperator() + " completed.");
        } catch (DivideBy1MilException e) {
            logger.error(e.getMessage());

        } finally {
            calc1.reset();
        }


        calc1.setOperator(Operator.valueOf("DIVIDE"));

        try {
            System.out.println(calc1.getOperator().calculate(800000, 1000000));
            logger.info(calc1.getOperator() + " completed.");
        } catch (DivideBy1MilException e) {
            logger.error(e.getMessage());

        } finally {
            calc1.reset();
        }


        CalculatorComplex calcComplex = new CalculatorComplex();

        calcComplex.setSimpleOperator(Operator.valueOf("MULTIPLY"));
        calcComplex.setOperatorInsideParenthesis(Operator.valueOf("ADDITION"));

        try {
            System.out.println(
                    calcComplex.doParentheses(5, 7, 1));
            logger.info("Operations completed!");
        } catch (DivideBy1MilException e) {
            logger.error(e.getMessage());
        } finally {
            calcComplex.reset();

        }


        calcComplex.setSimpleOperator(Operator.valueOf("DIVIDE"));
        try {
            System.out.println(calcComplex.getSimpleOperator().calculate(1, -10000000));
            logger.info(calcComplex.getSimpleOperator() + " completed!");
        } catch (DivideBy1MilException e) {
            logger.error(e.getMessage());
        } finally {
            calcComplex.reset();
        }
    }
}



