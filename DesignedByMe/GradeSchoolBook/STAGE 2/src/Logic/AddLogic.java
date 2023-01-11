package Logic;

import ObjectSchoolClass.*;
import TextAndEnumOptions.TextMessage;
import TextAndEnumOptions.UserClassOptionList;
import Utilies.ErrorMessage;
import Utilies.InputCorrectData;
import Utilies.PrintMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddLogic {
    private static PossibleGrades grades = new PossibleGrades();

    public static ClassBook createNewClassBook(Scanner scannerInput, ClassBook classBook) {
        if (ClassBook.getCount() < ClassBook.MAX_CLASS_BOOK) {
            PrintMessage.printStringMessage(TextMessage.CREATE_NEW_CLASS_BOOK);
            classBook = new ClassBook(scannerInput.nextLine());
            PrintMessage.printStringMessage(TextMessage.NEW_CLASS_BOOK_SUCCESS + classBook.getName());
            return classBook;
        } else {
            PrintMessage.printStringMessage(TextMessage.MAX_CLASS_BOOK_REACH + ClassBook.MAX_CLASS_BOOK);
        }
        return classBook;
    }

    public static void add(ClassBook classBook, Scanner scannerInput) {
        int userChoose = UserPrintLogicSchema.printLogicTextUser(classBook, scannerInput);
        if (userChoose != ErrorMessage.LOGIC_ERROR_NUMBER) {
            if (userChoose == UserClassOptionList.OPTION_SUBJECT.ordinal()) {
                subject(classBook, scannerInput);
            } else if (userChoose == UserClassOptionList.OPTION_STUDENT.ordinal()) {
                student(classBook, scannerInput);
            } else if (userChoose == UserClassOptionList.OPTION_GRADE.ordinal()) {
                grade(classBook, scannerInput);
            } else {
                PrintMessage.printStringMessageError(ErrorMessage.UNKNOWN_NUMBER);
            }
        }
    }

    private static void grade(ClassBook classBook, Scanner scannerInput) {
        if (classBook.getStudents() == null || classBook.getSubjects() == null) {
            PrintMessage.printStringMessageError(ErrorMessage.NEED_SUBJECT_AND_STUDENT);
        } else {
            List<Subject> subjects = classBook.getSubjects();
            List<Student> students = classBook.getStudents();
            PrintMessage.printStringMessage(TextMessage.ADD_GRADE_CHOOSE_SUBJECT);
            for (int i = 0; i < subjects.size(); i++) {
                PrintMessage.printStringMessage((i) + " - " + subjects.get(i).getName());
            }
            int subjectPosition = InputCorrectData.numberIntInput(scannerInput);

            PrintMessage.printStringMessage(TextMessage.ADD_GRADE_CHOOSE_STUDENT);
            for (int i = 0; i < students.size(); i++) {
                PrintMessage.printStringMessage((i) + " - " + students.get(i).toString());
            }
            int studentPosition = InputCorrectData.numberIntInput(scannerInput);
            PrintMessage.printStringMessage(TextMessage.GRADE);
            for (int i = 0; i < grades.getGrades().length; i++) {
                PrintMessage.printStringMessage(i + " - " + grades.getGrades()[i]);
            }
            int grade = InputCorrectData.numberIntInput(scannerInput);
            PrintMessage.printStringMessage(TextMessage.ADD_GRADE_SUCCESS + grades.getGrades()[grade]);
            if (classBook.getGrades() != null) {
                List<Grade> gradeList = classBook.getGrades();
                gradeList.add(new Grade(subjects.get(subjectPosition), students.get(studentPosition), grades.getGrades()[grade]));
            } else {
                List<Grade> gradeList = new ArrayList<>();
                gradeList.add(new Grade(subjects.get(subjectPosition), students.get(studentPosition), grades.getGrades()[grade]));
                classBook.setGrades(gradeList);
            }
        }
    }

    private static void student(ClassBook classBook, Scanner scannerInput) {
        boolean exitFlag = false;
        int studentIndexNumber = 0;
        PrintMessage.printStringMessage(TextMessage.ADD_STUDENT);
        PrintMessage.printStringMessage(TextMessage.ADD_STUDENT_NAME);
        String studentName = scannerInput.nextLine();
        PrintMessage.printStringMessage(TextMessage.ADD_STUDENT_LASTNAME);
        String studentLastname = scannerInput.nextLine();
        PrintMessage.printStringMessage(TextMessage.ADD_STUDENT_INDEX);
        while (!exitFlag) {
            studentIndexNumber = InputCorrectData.numberIntInput(scannerInput);
            if (studentIndexNumber > ErrorMessage.LOGIC_ERROR_NUMBER) {
                exitFlag = true;
            } else {
                PrintMessage.printStringMessageError(ErrorMessage.WRONG_INDEX_NUMBER);
                PrintMessage.printStringMessage(TextMessage.ADD_STUDENT_INDEX);
            }
        }
        if (classBook.getStudents() != null) {
            List<Student> students = classBook.getStudents();
            students.add(new Student(studentName, studentLastname, studentIndexNumber));
        } else {
            List<Student> students = new ArrayList<>();
            students.add(new Student(studentName, studentLastname, studentIndexNumber));
            classBook.setStudents(students);
        }
        PrintMessage.printStringMessage(TextMessage.CONFIRM_STUDENT_NAME + studentName.toUpperCase() +
                TextMessage.CONFIRM_STUDENT_LASTNAME + studentLastname.toUpperCase() +
                TextMessage.CONFIRM_STUDENT_INDEX + studentIndexNumber);
    }

    private static void subject(ClassBook classBook, Scanner scannerInput) {
        PrintMessage.printStringMessage(TextMessage.ADD_SUBJECT);
        if (classBook.getSubjects() != null) {
            List<Subject> subjects = classBook.getSubjects();
            subjects.add(new Subject(scannerInput.nextLine()));
        } else {
            List<Subject> subjects = new ArrayList<>();
            subjects.add(new Subject(scannerInput.nextLine()));
            classBook.setSubjects(subjects);
        }
    }
}

