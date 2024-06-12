import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

public class CollectionList {
    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(CollectionList.class);

    public static void main(String[] args) {
        // 1. ArrayList
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("1984"); // List: ["1984"]
        bookList.add("To Kill a Mockingbird"); // List: ["1984", "To Kill a Mockingbird"]
        bookList.add(0, "Brave New World"); // List: ["Brave New World", "1984", "To Kill a Mockingbird"]
        logger.info("ArrayList of Books: ");
        for (String book : bookList) {
            logger.info(book);
        }

        // 2. LinkedList
        LinkedList<String> movieList = new LinkedList<>();
        movieList.add("Inception"); // ["Inception"]
        movieList.add("The Matrix"); // ["Inception", "The Matrix"]
        movieList.add(0, "Interstellar"); // ["Interstellar", "Inception", "The Matrix"]
        logger.info("LinkedList of Movies: ");
        Iterator<String> movieIterator = movieList.iterator();
        while (movieIterator.hasNext()) {
            logger.info(movieIterator.next());
        }

        // 3. Vector
        Vector<String> cityVector = new Vector<>();
        cityVector.add("New York"); // ["New York"]
        cityVector.add("Los Angeles"); // ["New York", "Los Angeles"]
        cityVector.add("Chicago"); // ["New York", "Los Angeles", "Chicago"]
        cityVector.remove("Los Angeles"); // ["New York", "Chicago"]
        logger.info("Vector of Cities: ");
        Iterator<String> cityIterator = cityVector.iterator();
        while (cityIterator.hasNext()) {
            logger.info(cityIterator.next());
        }

        // 4. Stack
        Stack<String> taskStack = new Stack<>();
        taskStack.push("Write Report"); // ["Write Report"]
        taskStack.push("Attend Meeting"); // ["Write Report", "Attend Meeting"]
        taskStack.push("Check Emails"); // ["Write Report", "Attend Meeting", "Check Emails"]
        taskStack.pop(); // Removes "Check Emails"
        taskStack.push("Code Review"); // ["Write Report", "Attend Meeting", "Code Review"]
        taskStack.push("Team Lunch"); // ["Write Report", "Attend Meeting", "Code Review", "Team Lunch"]
        taskStack.pop(); // Removes "Team Lunch"
        logger.info("Stack of Tasks: ");
        for (String task : taskStack) {
            logger.info(task);
        }
    }
}
