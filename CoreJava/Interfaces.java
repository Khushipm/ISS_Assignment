import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    private static final Logger logger = LogManager.getLogger(Circle.class);

    @Override
    public void draw() {
        logger.info("Drawing a Circle");
    }
}

public class Interfaces {
    private static final Logger logger = LogManager.getLogger(Interfaces.class);

    public static void main(String[] args) {
        Drawable drawable = new Circle();
        drawable.draw();
    }
}
