import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    private static final Logger logger = LogManager.getLogger(ExceptionHandling.class);

    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            logger.error("FileNotFoundException caught: {}", e.getMessage());
        }
    }
}
