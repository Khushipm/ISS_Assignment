import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Animal {
    private static final Logger logger = LogManager.getLogger(Animal.class);

    public void makeSound() {
        logger.info("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        logger.info("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        logger.info("Cat meows");
    }
}

public class Polymorphism {
    private static final Logger logger = LogManager.getLogger(Polymorphism.class);

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound();
    }
}
