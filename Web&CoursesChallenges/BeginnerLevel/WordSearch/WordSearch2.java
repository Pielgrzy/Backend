package WordSearch;

public class WordSearch2 {
    public static void main(String[] args) {
        String sentence = "The new newt is newer than anew news";
        String wordCheck = "new";
        String wordSubstring = "";

        int countWordCheckInSentence = 0;
        String[] wordArray = sentence.split(" ");

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > wordCheck.length()) {
                for (int j = 0; j < wordArray[i].length() - 2; j++) {
                    wordSubstring = wordArray[i].substring(j, j + 3);
                    if (wordSubstring.toLowerCase().equals(wordCheck)) {
                        countWordCheckInSentence++;
                    }
                }
            } else if (wordArray[i].length() > wordCheck.length() - 1) {
                if (wordArray[i].toLowerCase().equals(wordCheck)) {
                    countWordCheckInSentence++;
                }
            }
        }
        System.out.println("Sentence: " + sentence);
        System.out.println("Count phrase \"new\" in sentence: " + countWordCheckInSentence);
    }

}