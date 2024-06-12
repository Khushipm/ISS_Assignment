import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CollectionMap {
    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(CollectionMap.class);

    public static void main(String[] args) {
        // 1. HashMap
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 92);
        logger.info("HashMap - Student Grades:");
        studentGrades.forEach((key, value) -> logger.info("Student: " + key + ", Grade: " + value));

        // 2. LinkedHashMap
        LinkedHashMap<String, String> countryCapitals = new LinkedHashMap<>();
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("India", "New Delhi");
        logger.info("LinkedHashMap - Country Capitals:");
        countryCapitals.forEach((key, value) -> logger.info("Country: " + key + ", Capital: " + value));

        // 3. TreeMap
        TreeMap<Integer, String> productCatalog = new TreeMap<>();
        productCatalog.put(101, "Laptop");
        productCatalog.put(103, "Smartphone");
        productCatalog.put(102, "Tablet");
        productCatalog.put(104, "Smartwatch");
        logger.info("TreeMap - Product Catalog:");
        productCatalog.forEach((key, value) -> logger.info("Product ID: " + key + ", Product: " + value));
    }
}
