import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Computer {
    private static final Logger logger = LogManager.getLogger(Computer.class);

    private String brand;
    private String processor;
    private int ram; // in GB

    // Default constructor
    public Computer() {
        this.brand = "Unknown Brand";
        this.processor = "Unknown Processor";
        this.ram = 0;
        logger.info("Default constructor called: Brand set to '{}', Processor set to '{}', RAM set to {} GB", brand, processor, ram);
    }

    // Parameterized constructor
    public Computer(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        logger.info("Parameterized constructor called: Brand set to '{}', Processor set to '{}', RAM set to {} GB", brand, processor, ram);
    }

    // Copy constructor
    public Computer(Computer another) {
        this.brand = another.brand;
        this.processor = another.processor;
        this.ram = another.ram;
        logger.info("Copy constructor called: Brand set to '{}', Processor set to '{}', RAM set to {} GB", brand, processor, ram);
    }

    // Overloaded constructor with different parameters
    public Computer(String brand, String processor) {
        this(brand, processor, 8); // Calling another constructor with default RAM value
        logger.info("Overloaded constructor with two parameters called: Brand set to '{}', Processor set to '{}', RAM set to {} GB", brand, processor, ram);
    }

    // Method to display computer information
    public void displayInfo() {
        logger.info("Computer Brand: '{}', Processor: '{}', RAM: {} GB", brand, processor, ram);
    }
}

public class Constructor {
    private static final Logger logger = LogManager.getLogger(Constructor.class);

    public static void main(String[] args) {
        // Create instance using default constructor
        Computer computer1 = new Computer();
        computer1.displayInfo();

        // Create instance using parameterized constructor
        Computer computer2 = new Computer("Dell", "Intel i7", 16);
        computer2.displayInfo();

        // Create instance using copy constructor
        Computer computer3 = new Computer(computer2);
        computer3.displayInfo();

        // Create instance using overloaded constructor
        Computer computer4 = new Computer("HP", "AMD Ryzen 5");
        computer4.displayInfo();
    }
}
