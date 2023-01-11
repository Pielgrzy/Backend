package TestData;

import ObjectSchoolClass.Grade;
import ObjectSchoolClass.Student;
import ObjectSchoolClass.Subject;

import java.util.ArrayList;
import java.util.List;

public class CollectionGrades {
    public static List<Grade> grades() {
        List<Student> students = CollectionStudents.students();
        List<Subject> subjects = CollectionSubject.subjects();
        List<Grade> grades = new ArrayList<>();
        grades.add(new Grade(subjects.get(0), students.get(1), 5.0));
        grades.add(new Grade(subjects.get(1), students.get(2), 2.5));
        grades.add(new Grade(subjects.get(2), students.get(3), 4.0));
        grades.add(new Grade(subjects.get(0), students.get(4), 3.0));
        grades.add(new Grade(subjects.get(1), students.get(0), 3.5));
        grades.add(new Grade(subjects.get(2), students.get(1), 2.0));
        return grades;
    }
}

