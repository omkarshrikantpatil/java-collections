import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Omkar", 8));
        students.add(new Student("Arti", 7.2));

        students.sort(null);
        System.out.println(students);

    }
}