package Logic;

import ObjectSchoolClass.ClassBook;
import TextAndEnumOptions.TextMessage;
import TextAndEnumOptions.UserClassOptionList;
import TextAndEnumOptions.UserMainOptionsList;
import TextAndEnumOptions.UserPrintOptionList;
import Utilies.ErrorMessage;
import Utilies.InputCorrectData;
import Utilies.PrintMessage;
import java.util.List;
import java.util.Scanner;

public class UserPrintLogicSchema {

    public static int printLogicTextUser(ClassBook classBook, Scanner scannerInput) {
        int userChoose = ErrorMessage.LOGIC_ERROR_NUMBER;
        if (classBook != null) {
            for (UserClassOptionList option : UserClassOptionList.values()) {
                PrintMessage.printStringMessage(option.ordinal() + " - " + option.getDescription());
            }
            userChoose = InputCorrectData.numberIntInput(scannerInput);
        } else {
            PrintMessage.printStringMessageError(ErrorMessage.NO_CLASS_BOOK_CREATED);
            return userChoose;
        }
        return userChoose;
    }

    public static int textPrint(ClassBook classBook, Scanner scannerInput) {
        int userChoose = ErrorMessage.LOGIC_ERROR_NUMBER;
        if (classBook != null) {
            for (UserPrintOptionList option : UserPrintOptionList.values()) {
                PrintMessage.printStringMessage(option.ordinal() + " - " + option.getDescription());
            }
            userChoose = InputCorrectData.numberIntInput(scannerInput);
        } else {
            PrintMessage.printStringMessageError(ErrorMessage.NO_CLASS_BOOK_CREATED);
            return userChoose;
        }
        return userChoose;
    }

    public static String printMenu(List<Object> obj) {
        StringBuilder gradesBuilder = new StringBuilder();
        for (int i = 0; i < obj.size(); i++) {
            String name = obj.get(i).toString();
            gradesBuilder
                    .append(i)
                    .append(" - ")
                    .append(name)
                    .append("\n");
        }
        return gradesBuilder.toString();
    }

    public static void printMainMenu() {
        PrintMessage.printStringMessage(TextMessage.CHOOSE_OPTION);
        for (UserMainOptionsList option : UserMainOptionsList.values()) {
            PrintMessage.printStringMessage(option.ordinal() + " - " + option.getDescription());
        }
    }
}
