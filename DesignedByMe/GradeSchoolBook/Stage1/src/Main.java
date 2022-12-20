import Data.CollectionStudents;
import Data.CollectionSubject;
import Logic.GradeSystem;
import ObjectSchoolClass.ClassBook;

public class Main {
    public static void main(String[] args) {
        ClassBook classBook = new ClassBook("1C", CollectionStudents.students(), CollectionSubject.subjects());
        System.out.println(classBook);

        GradeSystem.addGrade(classBook.getSubjects()[0], classBook.getStudents()[0], 5.0);
        GradeSystem.addGrade(classBook.getSubjects()[1], classBook.getStudents()[1], 3.0);
        GradeSystem.addGrade(classBook.getSubjects()[2], classBook.getStudents()[2], 2.0);
        GradeSystem.addGrade(classBook.getSubjects()[0], classBook.getStudents()[3], 2.0);
        GradeSystem.addGrade(classBook.getSubjects()[0], classBook.getStudents()[4], 2.0);
        GradeSystem.addGrade(classBook.getSubjects()[1], classBook.getStudents()[4], 2.0);
        GradeSystem.addGrade(classBook.getSubjects()[2], classBook.getStudents()[4], 2.0);

        System.out.println(GradeSystem.printGradesAll());
        System.out.println(GradeSystem.printGradesForSubject(classBook.getSubjects()[0]));
        System.out.println(GradeSystem.printGradesForSubject(classBook.getSubjects()[1]));
        System.out.println(GradeSystem.printGradeForStudent(classBook.getStudents()[0]));
        System.out.println(GradeSystem.printGradeForStudent(classBook.getStudents()[1]));
        System.out.println(GradeSystem.printGradeForStudent(classBook.getStudents()[2]));
        System.out.println(GradeSystem.printGradeForStudent(classBook.getStudents()[3]));
        System.out.println(GradeSystem.printGradeForStudent(classBook.getStudents()[4]));

    }
}
