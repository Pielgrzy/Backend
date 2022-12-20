package Data;

import ObjectSchoolClass.Student;

public class CollectionStudents {

    public static Student[] students(){
        Student[] students = new Student[5];
        students[0] = new Student("Jan", "A", 14782);
        students[1] = new Student("Joe", "B", 14783);
        students[2] = new Student("Kris", "C", 14784);
        students[3] = new Student("Kate", "D", 14785);
        students[4] = new Student("Adam", "E", 14786);
        return students;
    }
}
