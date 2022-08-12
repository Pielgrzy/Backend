package FindTheWord;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindTheWord2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean errorFlag = true;
        int wordInSentenceToPrint = 0;
        String sentence = "My little programming adventure";

        String[] sentenceArray = sentence.split(" ");
        System.out.println(sentence);
        System.out.println("Enter number word to print:");
        do {
            try {
                wordInSentenceToPrint = input.nextInt();
                //check if number is same or lower than word in sentence
                if (wordInSentenceToPrint >= sentenceArray.length + 1) {
                    //if number is larger then enter number one more time in loop
                    while (wordInSentenceToPrint > sentenceArray.length) {
                        System.err.println("There is not soo many words in sentence, please pick up something in boundry 1 - "
                                + sentenceArray.length);
                        // clear buffer
                        input.nextLine();
                        wordInSentenceToPrint = input.nextInt();
                    }
                }
                errorFlag = false;
            } catch (InputMismatchException exception) {
                System.err.println("The value provided is not an integer, please entry value one more time.");
                // clear buffer
                input.nextLine();
            }
        } while (errorFlag);
        input.close();
        System.out.println(sentenceArray[wordInSentenceToPrint - 1]);
    }
}
