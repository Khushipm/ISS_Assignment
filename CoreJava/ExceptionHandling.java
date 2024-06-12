import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionHandling {

    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(ExceptionHandling.class);

    public static void main(String[] args) {
        // Handling NumberFormatException
        String invalidNumber = "123a";
        try {
            int number = Integer.parseInt(invalidNumber);
            logger.info("Parsed number: " + number);
        } catch (NumberFormatException e) {
            logger.error("NumberFormatException thrown: ", e);
        } finally {
            logger.info("Finished attempting to parse number.");
        }

        // Handling ArithmeticException
        try {
            int result = 10 / 0;
            logger.info("Result of division: " + result);
        } catch (ArithmeticException e) {
            logger.error("ArithmeticException thrown: ", e);
        } finally {
            logger.info("Attempted division operation.");
        }

        // Handling FileNotFoundException and IOException for a properties file
        FileInputStream file = null;
        String fileName = "config.properties";
        try {
            file = new FileInputStream(fileName);
            int data = file.read();
            logger.info("First byte of the properties file: " + data);
        } catch (FileNotFoundException f) {
            logger.error("FileNotFoundException: ", f);
        } catch (IOException i) {
            logger.error("IOException: ", i);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException i) {
                    logger.error("IOException while closing the file: ", i);
                }
            }
            logger.info("File handling operation completed.");
        }
    }
}
