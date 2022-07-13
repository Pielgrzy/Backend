package Zadanie1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExecuteOrder1 {
    /*
Counts the value of characters in STRING and returns the number of letters in a word np:
Example:
IN  = aaafffcccc;
OUT = 3a3f4c
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = input.nextLine();
        //Create a new Map with two parameters
        Map<Character, Integer> charMapCount = new LinkedHashMap<>();
        // loop for, that go through  all chars in word
        for (Character c : word.toCharArray()) {
            // if there is the same char in Map rise count +1
            if (charMapCount.containsKey(c)) {
                charMapCount.put(c, charMapCount.get(c) + 1);
            } else {
                // if there is a new char put in to Map and set value count to 1
                charMapCount.put(c, 1);
            }
        }
        // for loop to get values and keys from Map
        for (Map.Entry<Character, Integer> mapVar : charMapCount.entrySet()) {
            //print Map values and keys
            System.out.print(mapVar.getValue() + "" + mapVar.getKey());
        }
        input.close();
    }
}
