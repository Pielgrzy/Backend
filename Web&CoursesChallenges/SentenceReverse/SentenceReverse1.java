package SentenceReverse;

public class SentenceReverse1 {
    public static void main(String[] args) {
        final String sentenceToReverse = "Dog bites man and man fells pain";
        String reverseSentence = "";

        // build String array with split method
        String[] stringsArray = sentenceToReverse.split(" ");
        for (int i = stringsArray.length; i > 0; i--) {
            if (i > 1) {
                reverseSentence += stringsArray[i - 1] + " ";
            } else {
                reverseSentence += stringsArray[i - 1];
            }
        }
        System.out.println(reverseSentence);
    }
}
