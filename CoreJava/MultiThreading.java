import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MyThread extends Thread {
    private static final Logger logger = LogManager.getLogger(MyThread.class);

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            logger.info("Thread: {}", Thread.currentThread().getName());
        }
    }
}

public class MultiThreading {
    private static final Logger logger = LogManager.getLogger(MultiThreading.class);

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}
