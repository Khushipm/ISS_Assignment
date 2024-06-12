import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Book {
    // Declaring and initializing the attributes
    private String title;
    private String author;
    private int pages;

    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(Book.class);

    // Methods to set the title, author, and number of pages of the book
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Method to print all three values
    public void printDetails() {
        logger.info("Book details:");
        logger.info("Title: {}", this.title);
        logger.info("Author: {}", this.author);
        logger.info("Pages: {}", this.pages);
    }

    // Methods to demonstrate instance variables
    public void addPages(int additionalPages) {
        this.pages += additionalPages;
        logger.info("The book has gained {} additional pages. New total: {} pages.", additionalPages, this.pages);
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
        logger.info("The book author has changed to {}.", this.author);
    }
}

public class Basic {
    public static void main(String[] args) {
        // Creating an object of the class Book
        Book book = new Book();

        // Setting the attributes
        book.setTitle("The Great Gatsby");
        book.setAuthor("F. Scott Fitzgerald");
        book.setPages(180);

        // Printing values
        book.printDetails();

        // Add pages to the book
        book.addPages(20);

        // Change the author of the book
        book.changeAuthor("Anonymous");

        // Print final values
        book.printDetails();
    }
}
