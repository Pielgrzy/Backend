package Utilies;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCorrectData {
    public static int numberIntInput(Scanner scannerInput) {
        int number = ErrorMessage.LOGIC_ERROR_NUMBER;
        try {
            number = scannerInput.nextInt();
            scannerInput.nextLine();
        } catch (InputMismatchException e) {
            System.err.println(ErrorMessage.INPUT_NOT_INT);
            scannerInput.nextLine();
        }
        return number;
    }
    public static double numberDoubleInput(Scanner scannerInput) {
        double number = ErrorMessage.LOGIC_ERROR_NUMBER;
        try {
            number = scannerInput.nextDouble();
            scannerInput.nextLine();
        } catch (InputMismatchException e) {
            System.err.println(ErrorMessage.INPUT_NOT_DOUBLE);
            scannerInput.nextLine();
        }
        return number;
    }
}
