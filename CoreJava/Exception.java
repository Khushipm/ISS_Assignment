import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate Checked Exception
class CheckedExceptionExample {
    private static final Logger logger = LogManager.getLogger(CheckedExceptionExample.class);

    public void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            logger.info("Read line: {}", line);
        }
        reader.close();
    }
}

// Demonstrate Unchecked Exception
class UncheckedExceptionExample {
    private static final Logger logger = LogManager.getLogger(UncheckedExceptionExample.class);

    public void accessArrayElement(int[] array, int index) {
        int element = array[index];
        logger.info("Accessed element: {}", element);
    }
}

// Demonstrate Error
class ErrorExample {
    private static final Logger logger = LogManager.getLogger(ErrorExample.class);

    public void causeOutOfMemoryError() {
        int[] array = new int[Integer.MAX_VALUE];
        logger.info("Array created with size: {}", array.length);
    }
}

public class Exception {
    private static final Logger logger = LogManager.getLogger(Exception.class);

    public static void main(String[] args) {
        // Checked Exception Example
        CheckedExceptionExample checkedExample = new CheckedExceptionExample();
        try {
            checkedExample.readFile("nonexistentfile.txt");
        } catch (IOException e) {
            logger.error("Checked Exception: IOException occurred", e);
        }

        // Unchecked Exception Example
        UncheckedExceptionExample uncheckedExample = new UncheckedExceptionExample();
        int[] array = {1, 2, 3};
        try {
            uncheckedExample.accessArrayElement(array, 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("Unchecked Exception: ArrayIndexOutOfBoundsException occurred", e);
        }

        // Error Example
        ErrorExample errorExample = new ErrorExample();
        try {
            errorExample.causeOutOfMemoryError();
        } catch (OutOfMemoryError e) {
            logger.error("Error: OutOfMemoryError occurred", e);
        }
    }
}
