import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private static final Logger logger = LogManager.getLogger(Student.class);

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SortExample {
    private static final Logger logger = LogManager.getLogger(SortExample.class);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students);

        logger.info("Sorted by ID:");
        for (Student student : students) {
            logger.info(student);
        }

        students.sort(Comparator.comparing(Student::getName));

        logger.info("Sorted by Name:");
        for (Student student : students) {
            logger.info(student);
        }
    }
}
