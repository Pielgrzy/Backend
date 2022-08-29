package NumberReversal;

public class NumberReversal1 {
    public static void main(String[] args) {
        int numberReversal = 6593;
        double decimalNumberToReverse = 159892.5;

        System.out.println("Number: " + numberReversal + ", reverse: " + getIntNumberReversal(numberReversal));
        System.out.println("Number: " + decimalNumberToReverse + ", reverse: " + getDecimalNumberReverse(decimalNumberToReverse));

    }

    private static int getIntNumberReversal(int numberReversal) {
        StringBuilder numberString = new StringBuilder();
        numberString.append(numberReversal);
        numberString.reverse();
        numberReversal = Integer.parseInt(numberString.toString());
        return numberReversal;
    }

    private static double getDecimalNumberReverse(double decimalNumberToReverse) {
        StringBuilder numberString = new StringBuilder();
        numberString.append(decimalNumberToReverse);
        int point = numberString.indexOf(".");
        numberString.delete(point, point + 1);
        numberString.reverse();
        numberString.replace(point, point, ".");
        decimalNumberToReverse = Double.parseDouble(numberString.toString());
        return decimalNumberToReverse;
    }
}
