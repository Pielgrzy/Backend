package SentenceReverse;

public class SentenceReverse2 {
    public static void main(String[] args) {
        String sentenceToReverse = "Dog bites man and man fells pain?";
        String reverseSentence = "";
        char[] arrayCharPunctuation = {'!', '?', '.'};
        boolean hasPunctuationSign = false;

        //check last char in sentence, if have punctuation sign create new string and remember sign
        char punctuationChar = sentenceToReverse.charAt(sentenceToReverse.length() - 1);
        for (int i = 0; i < arrayCharPunctuation.length; i++) {
            if (punctuationChar == arrayCharPunctuation[i]) {
                sentenceToReverse = sentenceToReverse.substring(0, sentenceToReverse.length() - 1);
                hasPunctuationSign = true;
            }
        }
        // build String array with split method and create reverse sentence according to statements
        String[] stringsArray = sentenceToReverse.split(" ");
        for (int i = stringsArray.length; i > 0; i--) {
            if (i > 1) {
                reverseSentence += stringsArray[i - 1] + " ";
            } else if (hasPunctuationSign) {
                reverseSentence += stringsArray[i - 1] + punctuationChar;
            } else {
                reverseSentence += stringsArray[i - 1];
            }
        }

        // replace first small char to big one
        reverseSentence = reverseSentence.substring(0,1).toUpperCase() + reverseSentence.substring(1);

        // print reverse sentence with first big letter and punctuation sing on last place
        System.out.println(reverseSentence);
    }
}
