import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionSet {
    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(CollectionSet.class);

    public static void main(String[] args) {
        // 1. HashSet
        HashSet<String> studentSet = new HashSet<>();
        studentSet.add("Alice");
        studentSet.add("Bob");
        studentSet.add("Charlie");
        studentSet.add("Diana");
        logger.info("HashSet - Students:");
        for (String student : studentSet) {
            logger.info(student);
        }

        // 2. LinkedHashSet
        LinkedHashSet<String> bookSet = new LinkedHashSet<>();
        bookSet.add("1984");
        bookSet.add("To Kill a Mockingbird");
        bookSet.add("Brave New World");
        bookSet.add("The Great Gatsby");
        logger.info("LinkedHashSet - Books:");
        for (String book : bookSet) {
            logger.info(book);
        }

        // 3. TreeSet
        TreeSet<String> citySet = new TreeSet<>();
        citySet.add("New York");
        citySet.add("Los Angeles");
        citySet.add("Chicago");
        citySet.add("Houston");
        logger.info("TreeSet - Cities:");
        for (String city : citySet) {
            logger.info(city);
        }
    }
}
