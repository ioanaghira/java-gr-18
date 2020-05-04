import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * What do they have in common ?
 * the common elements are the operators.
 *
 * Do we need an interface ?
 * yes, to implement the method calculate() for each operator.
 * @param <T>
 */

public interface Operation<T extends Number> {

    Logger logger = LogManager.getLogger(Operation.class);

    int calculate(T fistNumber, T secondNumber) throws DivideBy1MilException;

}
