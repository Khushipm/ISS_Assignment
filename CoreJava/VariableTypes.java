import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Books {
    // Instance variable
    String title;

    // Static variable
    static int numberOfBooks = 0;

    // Constructor
    public Books(String title) {
        this.title = title;
        numberOfBooks++;
    }

    // Instance Method
    public void setTitle(String title) {
        this.title = title;
    }

    // Static method
    public static int getNumberOfBooks() {
        return numberOfBooks;
    }
}

public class VariableTypes {

    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(VariableTypes.class);
    
    public static void main(String[] args) {
        // Local Variables
        String authorName = "J.K. Rowling";
        int publicationYear = 1997;
        
        logger.info("Local variable authorName: " + authorName);
        logger.info("Local variable publicationYear: " + publicationYear);
        
        // Creating objects of 'Books' class
        Books book1 = new Books("Harry Potter and the Philosopher's Stone");
        Books book2 = new Books("Harry Potter and the Chamber of Secrets");

        // Logging instance variables
        logger.info("Book 1 title: " + book1.title);
        logger.info("Book 2 title: " + book2.title);

        // Logging static variable
        logger.info("Number of books: " + Books.getNumberOfBooks());

        // Modifying instance variable
        book1.setTitle("Harry Potter and the Sorcerer's Stone");
        logger.info("Updated Book 1 title: " + book1.title);
    }
}
