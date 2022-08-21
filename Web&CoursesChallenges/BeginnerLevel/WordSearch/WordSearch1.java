package WordSearch;

import java.util.Scanner;

public class WordSearch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Hello world";

        String[] splitSentenceArray = sentence.split(" ");
        String firstWord = splitSentenceArray[0];

        System.out.println("Sentence: " + sentence);
        System.out.println("Enter word that will be compare to the first word in sentence");

        System.out.println(firstWord.equalsIgnoreCase(input.nextLine()));

    }
}
