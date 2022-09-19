package PrimeFactorization;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter scope for prime numbers checker");
        int number = input.nextInt();
        System.out.println("Prime numbers:");
        int count = 0;
        for (int i = 2; i <= number; i++) {
            int div = i / 2;
            if (primeChecker(i, div)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Number of prime numbers: " + count);
        input.close();
    }

    private static boolean primeChecker(int number, int div) {
        if (number == 2 || number == 3){
            return true;
        }
        for (int j = 2; j <= div; j++) {
            if (number % j == 0) {
                return false;
            } else if (j == div) {
                return true;
            }
        }
        return false;

    }
}
