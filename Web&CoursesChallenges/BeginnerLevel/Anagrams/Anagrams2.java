package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams2 {
    public static void main(String[] args) {
        List<String> wordsArray = new ArrayList<>(Arrays.asList("art", "tar", "act", "rat", "meats", "steam", "tra", "cat", "tac"));

        while (wordsArray.size() > 0) {
            //create empty array for words that are not anagrams
            List<String> updateArray = new ArrayList<>();
            //create empty array for words that are anagrams
            List<String> wordsAnagramsArray = new ArrayList<>();
            //take first word from array and change to char array
            char[] firstWord = wordsArray.get(0).toLowerCase().toCharArray();
            //sort first word char array
            Arrays.sort(firstWord);
            //add first word from array to anagram array
            wordsAnagramsArray.add(wordsArray.get(0));
            for (int i = 1; i < wordsArray.size(); i++) {
                //take i word from array and change to char array
                char[] secondWord = wordsArray.get(i).toLowerCase().toCharArray();
                //sort i word char array
                Arrays.sort(secondWord);
                //compare two sorted char arrays
                if (Arrays.equals(firstWord, secondWord)) {
                    //if true add word to anagram array
                    wordsAnagramsArray.add(wordsArray.get(i));
                } else {
                    //if false add word to not anagrams array
                    updateArray.add(wordsArray.get(i));
                }
            }
            //print anagram array
            System.out.println(wordsAnagramsArray.toString());
            //replace old words array to new one --> use left words that are not anagrams
            wordsArray = updateArray;
        }

    }
}
