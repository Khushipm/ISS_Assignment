import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringsAndArrays {
    private static final Logger logger = LogManager.getLogger(StringsAndArrays.class);

    public static void main(String[] args) {
        // Strings
        String greeting = "Hello, World!";
        logger.info("Greeting: {}", greeting);

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        logger.info("Numbers Array:");
        for (int number : numbers) {
            logger.info("Number: {}", number);
        }

        // 2D Arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        logger.info("2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                logger.info("Element [{}][{}]: {}", i, j, matrix[i][j]);
            }
        }
    }
}
