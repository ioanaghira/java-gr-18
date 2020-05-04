import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DivideByMinus1MilException extends RuntimeException{
    private static final Logger logger = LogManager.getLogger(DivideByMinus1MilException.class);
    public DivideByMinus1MilException(String message) {
               logger.fatal(message);
    }
}
