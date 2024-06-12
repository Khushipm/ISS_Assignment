import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Abstract class 
abstract class Animal {
    protected static final Logger logger = LogManager.getLogger(Animal.class);

    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    // Concrete method
    public void display() {
        logger.info("Animal Name: {}", name);
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        logger.info("Dog barks");
    }
}

public class Abstraction {
    private static final Logger logger = LogManager.getLogger(Abstraction.class);

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        dog.display();
        dog.makeSound();
    }
}
