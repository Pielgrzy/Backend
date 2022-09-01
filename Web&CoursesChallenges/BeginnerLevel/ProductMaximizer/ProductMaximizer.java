package ProductMaximizer;

import java.util.Arrays;

public class ProductMaximizer {
    public static void main(String[] args) {
        int[] intArray = {5, 7, 9, 2, 4, 1};
        Arrays.sort(intArray);

        int largestNumber = intArray[intArray.length - 1] * intArray[intArray.length - 2];
        System.out.println(largestNumber);

        int[] intArray2 = {5, 7, 9, 2, 4, 1, 8, 3};
        Arrays.sort(intArray2);

        int largestNumber2 = intArray[intArray.length - 1] * intArray2[intArray2.length - 1];
        System.out.println(largestNumber2);
    }
}
