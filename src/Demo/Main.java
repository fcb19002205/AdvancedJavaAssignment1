package Demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Marko", 18, 4.5));
        students.add(new Student(2, "Danijela", 19,4.2));
        students.add(new Student(3, "Nikola", 18,4.0));
        students.add(new Student(4, "Petra", 22,4.8));


        List<Student> filteredStudents = StudentUtils.filterStudents(students, (student -> student.getGpa() > 4.3 && student.getAge() >= 18));
        System.out.println("Filtered students: ");
        filteredStudents.forEach(System.out::println);

        List<Student> mappedStudents = StudentUtils.mapStudents(students, (student) -> new Student(student.getId(), student.getName() + " Horvat", student.getAge() + 1, student.getGpa() + 0.5));
        System.out.println("Mapped students: ");
        mappedStudents.forEach(System.out::println);

    }

}
