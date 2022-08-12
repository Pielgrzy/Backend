package FindTheWord;

public class FindTheWord1 {
    public static void main(String[] args) {
        String sentence = "My little programming adventure";

        String[] sentenceArray = sentence.split(" ");
        System.out.println(sentenceArray[sentenceArray.length-2]);
    }
}
