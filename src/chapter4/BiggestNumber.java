package chapter4;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();

        int maxValue = number;

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter number: ");
            number = input.nextInt();

            if (number > maxValue){
                maxValue = number;
            }

        }
        System.out.println("largest number is: " + maxValue);
    }
}
