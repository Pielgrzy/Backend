package ObjectSchoolClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassBook {
    private String name;
    private List<Student> students;
    private List<Subject> subjects;
    private List<Grade> grades;
    private static int count = 0;
    public static final int MAX_CLASS_BOOK = 1;

    public ClassBook(String name) {
        this.name = name;
        count++;
    }

    //region ---GET/SET---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public static int getCount() {
        return count;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    //endregion


    @Override
    public String toString() {
        String subjectList = getObjectListToPrint(Arrays.asList(subjects.toArray()));
        String studentList = getObjectListToPrint(Arrays.asList(students.toArray()));

        return "Class book " + name +
                "\nStudents:\n" + studentList +
                "Subjects:\n" + subjectList;
    }
    private String getObjectListToPrint(List<Object> obj) {
        StringBuilder stringBuilderList = new StringBuilder();
        for (Object objs : obj) {
            stringBuilderList
                    .append("   -  ")
                    .append(objs.toString())
                    .append("\n");
        }
        return stringBuilderList.toString();
    }
}