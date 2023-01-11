package TestData;

import ObjectSchoolClass.Student;

import java.util.ArrayList;
import java.util.List;

public class CollectionStudents {

    public static List<Student> students() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", "Jan", 14782));
        students.add(new Student("B", "Ben", 14783));
        students.add(new Student("C", "Charlie", 14784));
        students.add(new Student("D", "Diana", 14785));
        students.add(new Student("E", "Ela", 14786));
        return students;
    }
}
