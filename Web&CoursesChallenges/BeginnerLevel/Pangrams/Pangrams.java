package Pangrams;

public class Pangrams {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        int englishAlphabetSize = 26;
        char[] sentenceCharArray = getSentenceChars(sentence, englishAlphabetSize);

        System.out.println("Sentese: " + sentence + " - is panagram?");
        System.out.println(haveAllLetters(sentenceCharArray));
    }

    private static char[] getSentenceChars(String sentence, int englishAlphabetSize) {
        sentence = sentence.toLowerCase();
        char[] sentenceCharArray = new char[englishAlphabetSize];
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                int letter = sentence.charAt(i) - 'a';
                sentenceCharArray[letter] = sentence.charAt(i);
            }
        }
        return sentenceCharArray;
    }

    private static boolean haveAllLetters(char[] sentenceCharArray) {
        for (int i = 0; i < sentenceCharArray.length; i++) {
            if (sentenceCharArray[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
