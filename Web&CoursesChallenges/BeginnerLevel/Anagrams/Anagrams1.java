package Anagrams;

import java.util.Arrays;

public class Anagrams1 {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        String word3 = "sivent";
        String word4 = "cat";
        String word5 = "Paris";
        String word6 = "pairs";

        printInfo(word1, word2);
        printInfo(word1, word3);
        printInfo(word1, word4);
        printInfo(word5, word6);

    }
    private static boolean checkIfTwoWordsAreAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        } else {
            char[] charArray1 = word1.toLowerCase().toCharArray();
            char[] charArray2 = word2.toLowerCase().toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }
    }
    private static void printInfo(String word1, String word2) {
        System.out.println("Is word " + word1 + " and word " + word2 + " are anagrams? " + checkIfTwoWordsAreAnagram(word1, word2));
    }
}
