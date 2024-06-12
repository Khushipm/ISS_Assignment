import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DecisionMaking {
    private static final Logger logger = LogManager.getLogger(DecisionMaking.class);

    public static void main(String[] args) {
        // Example of if-else decision making
        int age = 20;
        if (age >= 18) {
            logger.info("You are eligible to vote.");
        } else {
            logger.info("You are not eligible to vote.");
        }

        // Example of nested if-else decision-making
        double grade = 85.5;
        if (grade >= 90) {
            logger.info("Grade: A");
        } else if (grade >= 80) {
            logger.info("Grade: B");
        } else if (grade >= 70) {
            logger.info("Grade: C");
        } else {
            logger.info("Grade: F");
        }

        // Example of switch-case decision making
        char gradeLetter = 'B';
        switch (gradeLetter) {
            case 'A':
                logger.info("Excellent!");
                break;
            case 'B':
                logger.info("Good Job!");
                break;
            case 'C':
                logger.info("Well done!");
                break;
            case 'D':
                logger.info("You passed.");
                break;
            case 'F':
                logger.info("Better try again.");
                break;
            default:
                logger.info("Invalid grade.");
        }

        // Another switch-case example with fall-through
        int month = 8;
        switch (month) {
            case 1:
            case 2:
            case 12:
                logger.info("It's winter.");
                break;
            case 3:
            case 4:
            case 5:
                logger.info("It's spring.");
                break;
            case 6:
            case 7:
            case 8:
                logger.info("It's summer.");
                break;
            case 9:
            case 10:
            case 11:
                logger.info("It's autumn.");
                break;
            default:
                logger.info("Invalid month.");
        }
    }
}
