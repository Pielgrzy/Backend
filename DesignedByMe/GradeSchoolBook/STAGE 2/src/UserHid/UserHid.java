package UserHid;

import Logic.PrintLogic;
import Logic.UserPrintLogicSchema;
import TestData.CollectionGrades;
import TestData.CollectionStudents;
import TestData.CollectionSubject;
import Logic.AddLogic;
import Logic.DeleteLogic;
import ObjectSchoolClass.ClassBook;
import TextAndEnumOptions.TextMessage;
import TextAndEnumOptions.UserMainOptionsList;
import Utilies.ErrorMessage;
import Utilies.InputCorrectData;
import Utilies.PrintMessage;

import java.util.Scanner;

public class UserHid {
    private static ClassBook classBook;
    private static Scanner scannerInput = new Scanner(System.in);

    public static void userHid() {
        int userChooseOption;
        boolean exitFlag = false;
        while (!exitFlag) {
            UserPrintLogicSchema.printMainMenu();
            userChooseOption = InputCorrectData.numberIntInput(scannerInput);
            if (userChooseOption == UserMainOptionsList.OPTION_CREATE_CLASS_BOOK.ordinal()) {
                classBook = AddLogic.createNewClassBook(scannerInput, classBook);
            } else if (userChooseOption == UserMainOptionsList.OPTION_ADD.ordinal()) {
                AddLogic.add(classBook, scannerInput);
            } else if (userChooseOption == UserMainOptionsList.OPTION_DELETE.ordinal()) {
                DeleteLogic.delete(classBook, scannerInput);
            } else if (userChooseOption == UserMainOptionsList.OPTION_PRINT.ordinal()) {
                PrintLogic.print(classBook, scannerInput);

                // ONLY FOR TESTS
            } else if (userChooseOption == UserMainOptionsList.OPTION_CREATE_PREDEFINE_CLASS_BOOK.ordinal()) {
                classBook = new ClassBook("TEST CLASS BOOK");
                classBook.setStudents(CollectionStudents.students());
                classBook.setSubjects(CollectionSubject.subjects());
                classBook.setGrades(CollectionGrades.grades());
                PrintMessage.printStringMessage("!!TEST CLASS BOOK CREATED!!");
                PrintMessage.printStringMessage(classBook.toString());
                // ONLY FOR TESTS

            } else if (userChooseOption == UserMainOptionsList.OPTION_EXIT.ordinal()) {
                exitFlag = true;
                PrintMessage.printStringMessage(TextMessage.OPTION_EXIT);
                scannerInput.close();
            } else {
                PrintMessage.printStringMessageError(ErrorMessage.UNKNOWN_NUMBER);
            }
        }
    }


}


