package ArmstrongNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        int number = 153;
        int sum = armstrongNumber(number);

        System.out.print("Number " + number + ": Armstrong: " + sum + " ");
        if (number == sum) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a range of numbers");
        int userRange = scanner.nextInt();
        scanner.nextLine();
        List<Integer> armstrongNumberList;
        armstrongNumberList = getListFromUserRange(userRange);
        System.out.println("List of armstrong numbers in range: " + armstrongNumberList);
        scanner.close();
    }

    private static List<Integer> getListFromUserRange(int userRange) {
        List<Integer> armstrongNumberList = new ArrayList<>();
        int count = 0;
        while (count <= userRange){
            if (count == armstrongNumber(count)){
                armstrongNumberList.add(count);
            }
            count++;
        }
        return armstrongNumberList;
    }

    private static int armstrongNumber(int number) {
        int sum = 0;
        int count = number;
        int power = 0;

        while (count > 0) {
            count = count / 10;
            power++;
        }
        while (number > 0) {
            int rest = number % 10;
            sum += Math.pow(rest, power);
            number = number / 10;
        }
        return sum;
    }
}
