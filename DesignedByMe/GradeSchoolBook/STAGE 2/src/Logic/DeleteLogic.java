package Logic;

import ObjectSchoolClass.ClassBook;
import ObjectSchoolClass.Grade;
import ObjectSchoolClass.Student;
import ObjectSchoolClass.Subject;
import TextAndEnumOptions.UserClassOptionList;
import TextAndEnumOptions.UserMainOptionsList;
import Utilies.ErrorMessage;
import Utilies.InputCorrectData;
import Utilies.PrintMessage;

import java.util.*;

public class DeleteLogic {

    public static void delete(ClassBook classBook, Scanner scannerInput) {
        int userChoose = UserPrintLogicSchema.printLogicTextUser(classBook, scannerInput);
        if (userChoose != ErrorMessage.LOGIC_ERROR_NUMBER) {
            if (userChoose == UserClassOptionList.OPTION_SUBJECT.ordinal()) {
                List<Object> newSubjectList = deleteObject(classBook, scannerInput, Arrays.asList(classBook.getSubjects().toArray()));
                classBook.setSubjects((List<Subject>)(Object)newSubjectList);
            } else if (userChoose == UserClassOptionList.OPTION_STUDENT.ordinal()) {
                List<Object> newStudentList = deleteObject(classBook, scannerInput, Collections.singletonList(classBook.getStudents()));
                classBook.setStudents((List<Student>)(Object)newStudentList);
            } else if (userChoose == UserClassOptionList.OPTION_GRADE.ordinal()) {
                deleteGrade(classBook, scannerInput);
            } else {
                PrintMessage.printStringMessageError(ErrorMessage.UNKNOWN_NUMBER);
            }
        } else if (classBook != null) {
            PrintMessage.printStringMessageError(ErrorMessage.UNKNOWN_NUMBER);
        }
    }

    private static void deleteGrade(ClassBook classBook, Scanner scannerInput) {
        List<Grade> grades = classBook.getGrades();
        if (grades != null && !grades.isEmpty()) {
            PrintMessage.printStringMessage(UserMainOptionsList.OPTION_DELETE.getDescription());
            PrintMessage.printStringMessage(UserPrintLogicSchema.printMenu(Arrays.asList(grades.toArray())));
            int deleteIndexItem = InputCorrectData.numberIntInput(scannerInput);
            Grade gradeToDelete = grades.get(deleteIndexItem);
            grades.remove(gradeToDelete);
            PrintMessage.printStringMessage("Delete: " + gradeToDelete.toString());
        } else {
            PrintMessage.printStringMessage("No grades to delete");
        }
    }

    private static List<Object> deleteObject(ClassBook classBook, Scanner scannerInput, List<Object> objects) {
        List<Grade> grades = classBook.getGrades();
        List<Object> object = new ArrayList<>(objects);
        if (objects.size() != 0) {
            PrintMessage.printStringMessage(UserMainOptionsList.OPTION_DELETE.getDescription());
            PrintMessage.printStringMessage(UserPrintLogicSchema.printMenu(Arrays.asList(objects.toArray())));
            int deleteIndexItem = InputCorrectData.numberIntInput(scannerInput);
            PrintMessage.printStringMessage("Deleted: " + objects.get(deleteIndexItem).toString());
            if (grades != null) {
                for (int i = 0; i < grades.size(); i++) {
                    if (grades.get(i).getSubject().getName().equals(objects.get(deleteIndexItem).toString())) {
                        grades.remove(i);
                        i--;
                    }
                }
            }
            object.remove(deleteIndexItem);
        } else {
            PrintMessage.printStringMessageError("NO OBJECT TO DELETE");
        }
        return object;
    }
}


