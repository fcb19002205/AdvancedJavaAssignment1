package Demo;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentUtils implements Filter, Mapper {

    public static List<Student> filterStudents(List<Student> students, Filter filter) {
        List<Student> filteredList = new ArrayList<>();
        for (Student student : students) {
            if (filter.filter(student)) {
                filteredList.add(student);
            }
        }
        return filteredList;
    }

    public static List<Student> mapStudents (List<Student> students, Mapper mapper) {
        List<Student> mappedList = new ArrayList<>();
        for (Student student : students) {
            Student mappedStudent = mapper.map(student);
            mappedList.add(mappedStudent);
        }
        return mappedList;
    }

}
