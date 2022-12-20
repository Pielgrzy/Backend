package ObjectSchoolClass;

public class ClassBook {
    private String name;
    private Student[] students;
    private Subject[] subjects;

    public ClassBook(String name, Student[] students, Subject[] subjects) {
        this.name = name;
        this.students = students;
        this.subjects = subjects;
    }

    //region ---GET/SET---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
    //endregion


    @Override
    public String toString() {
        String studentList = getObjectListToPrint(students);
        String subjectList = getObjectListToPrint(subjects);

        return "Class book " + name +
                "\nStudents:\n" + studentList +
                "Subjects:\n" + subjectList;
    }

    private String getObjectListToPrint(Object[] obj) {
        StringBuilder subjectBuilderList = new StringBuilder();
        for (Object objs : obj) {
            subjectBuilderList.append("   -  ").append(objs).append("\n");
        }
        return subjectBuilderList.toString();
    }
}