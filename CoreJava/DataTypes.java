import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Fruit {
    String name;
}

public class DataTypes {

    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(DataTypes.class);

    public static void main(String[] args) {

        // Demonstrating Different Primitive Data Types
        byte byteValue1 = 3;
        byte byteValue2 = 5;
        byte byteResult = (byte)(byteValue1 + byteValue2);
        logger.info("Byte: " + byteResult);

        short shortValue1 = 7;
        short shortValue2 = 10;
        short shortResult = (short)(shortValue1 + shortValue2);
        logger.info("Short: " + shortResult);

        int intValue1 = 15;
        int intValue2 = 25;
        int intResult = intValue1 + intValue2;
        logger.info("Int: " + intResult);

        long longValue1 = 100L;
        long longValue2 = 200L;
        long longResult = longValue1 + longValue2;
        logger.info("Long: " + longResult);

        float floatValue1 = 1.5f;
        float floatValue2 = 2.5f;
        float floatResult = floatValue1 + floatValue2;
        logger.info("Float: " + floatResult);

        double doubleValue1 = 5.5;
        double doubleValue2 = 6.5;
        double doubleResult = doubleValue1 + doubleValue2;
        logger.info("Double: " + doubleResult);

        boolean booleanValue = false;
        logger.info("Boolean: " + booleanValue);

        char charValue = 'B';
        logger.info("Char: " + charValue);

        // Demonstrating Reference (or, Object) Data Types

        // Creating an object of 'Fruit' class
        Fruit fruit = new Fruit();
        fruit.name = "Apple";
        logger.info("Fruit name is " + fruit.name);

        // Creating an object of 'String' class
        String myString = new String("Welcome to Java Basics!");
        logger.info(myString);
    }
}
