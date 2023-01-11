package Logic;

import ObjectSchoolClass.ClassBook;
import ObjectSchoolClass.Grade;
import TextAndEnumOptions.TextMessage;
import TextAndEnumOptions.UserPrintOptionList;
import Utilies.ErrorMessage;
import Utilies.InputCorrectData;
import Utilies.PrintMessage;

import java.util.*;

public class PrintLogic {

    public static void print(ClassBook classBook, Scanner scannerInput) {
        int userChoose = UserPrintLogicSchema.textPrint(classBook, scannerInput);
        if (userChoose != ErrorMessage.LOGIC_ERROR_NUMBER) {
            if (userChoose == UserPrintOptionList.OPTION_PRINT_CLASS_BOOK.ordinal()) {
                PrintMessage.printStringMessage(classBook.toString());
            } else if (userChoose == UserPrintOptionList.OPTION_PRINT_ALL_GRADES.ordinal()) {
                PrintMessage.printStringMessage(printGradesAll(classBook));
            } else if (userChoose == UserPrintOptionList.OPTION_PRINT_GRADES_FOR_SUBJECT.ordinal()) {
                PrintMessage.printStringMessage(printGradesForSubject(classBook, scannerInput));
            } else if (userChoose == UserPrintOptionList.OPTION_PRINT_GRADES_FOR_STUDENT.ordinal()) {
                PrintMessage.printStringMessage(printGradeForStudent(classBook, scannerInput));
            } else {
                PrintMessage.printStringMessageError(ErrorMessage.UNKNOWN_NUMBER);
            }
        }
    }

    private static String printGradesAll(ClassBook classBook) {
        List<Grade> grades = classBook.getGrades();
        StringBuilder gradesBuilder = new StringBuilder();
        if (grades == null || grades.isEmpty()) {
            return TextMessage.PRINT_EMPTY_TABLE;
        }
        for (Grade grade : grades) {
            gradesBuilder
                    .append(grade.getSubject())
                    .append("; ")
                    .append(grade.getStudent())
                    .append(" grade: ")
                    .append(grade.getGrade()).append("\n");
        }
        return gradesBuilder.toString();
    }

    private static String printGradesForSubject(ClassBook classBook, Scanner scannerInput) {
        List<Grade> grades = classBook.getGrades();
        StringBuilder gradesBuilder = new StringBuilder();
        if (grades == null || grades.isEmpty()) {
            return TextMessage.PRINT_EMPTY_TABLE;
        }
        PrintMessage.printStringMessage(UserPrintLogicSchema.printMenu(Arrays.asList(classBook.getSubjects().toArray())));
        int printSubjectGradeIndex = InputCorrectData.numberIntInput(scannerInput);
        String subjectToPrint = classBook.getSubjects().get(printSubjectGradeIndex).getName();
        gradesBuilder
                .append(subjectToPrint)
                .append("\n");

        for (Grade grade : grades) {
            if (subjectToPrint.equals(grade.getSubject().getName())) {
                gradesBuilder
                        .append(grade.getStudent().toString())
                        .append(" grade: ")
                        .append(grade.getGrade())
                        .append("\n");
            }
        }
        return gradesBuilder.toString();
    }

    private static String printGradeForStudent(ClassBook classBook, Scanner scannerInput) {
        List<Grade> grades = classBook.getGrades();
        StringBuilder gradesBuilder = new StringBuilder();
        if (grades == null || grades.isEmpty()) {
            return TextMessage.PRINT_EMPTY_TABLE;
        }
        PrintMessage.printStringMessage(UserPrintLogicSchema.printMenu(Arrays.asList(classBook.getStudents().toArray())));
        int printStudentGradeIndex = InputCorrectData.numberIntInput(scannerInput);
        gradesBuilder
                .append(classBook.getStudents().get(printStudentGradeIndex))
                .append("\n");
        for (Grade grade : grades) {
            if (grade.getStudent().getIndex() == classBook.getStudents().get(printStudentGradeIndex).getIndex()) {
                gradesBuilder
                        .append("Subject: ")
                        .append(grade.getSubject())
                        .append("; grade: ")
                        .append(grade.getGrade()).append("\n");
            }
        }
        return gradesBuilder.toString();
    }
}


