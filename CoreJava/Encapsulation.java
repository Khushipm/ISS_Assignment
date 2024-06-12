import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class to demonstrate Encapsulation
class Book {
    private static final Logger logger = LogManager.getLogger(Book.class);

    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter and Setter methods for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter methods for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter methods for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            logger.warn("Price cannot be negative or zero.");
        }
    }

    // Method to display book details
    public void displayBookInfo() {
        logger.info("Book Title: " + title);
        logger.info("Author: " + author);
        logger.info("Price: " + price);
    }
}

public class Encapsulation {
    private static final Logger logger = LogManager.getLogger(Encapsulation.class);

    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("1984", "George Orwell", 9.99);

        // Displaying initial book details
        logger.info("Initial book details:");
        book.displayBookInfo();

        // Modifying book details using setter methods
        book.setTitle("Animal Farm");
        book.setAuthor("George Orwell");
        book.setPrice(8.99);

        // Displaying modified book details
        logger.info("Modified book details:");
        book.displayBookInfo();

        // Attempt to set an invalid price
        book.setPrice(-5.00);  // This should trigger a warning
    }
}
