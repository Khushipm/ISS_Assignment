import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoopControl {
    private static final Logger logger = LogManager.getLogger(LoopControl.class);

    public static void main(String[] args) {
        logger.info("For Loop:");
        for (int i = 0; i < 5; i++) {
            logger.info("i: {}", i);
        }

        logger.info("While Loop:");
        int j = 0;
        while (j < 5) {
            logger.info("j: {}", j);
            j++;
        }

        logger.info("Do-While Loop:");
        int k = 0;
        do {
            logger.info("k: {}", k);
            k++;
        } while (k < 5);
    }
}
