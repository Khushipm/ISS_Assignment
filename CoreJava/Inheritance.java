import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Animal {
    protected static final Logger logger = LogManager.getLogger(Animal.class);

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        logger.info("Animal Name: {}", name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        logger.info("Dog barks");
    }
}

public class Inheritance {
    private static final Logger logger = LogManager.getLogger(Inheritance.class);

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.display();
        dog.makeSound();
    }
}
