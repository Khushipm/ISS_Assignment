import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinalExample {
    private static final Logger logger = LogManager.getLogger(FinalExample.class);

    private final int constantValue = 100;

    public void displayConstant() {
        logger.info("Constant Value: {}", constantValue);
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        example.displayConstant();
    }
}
