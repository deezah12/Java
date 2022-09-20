package codeLife;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        star();
    }

    public static void sumAgain() {
        char choice;
        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number");
            int number = input.nextInt();

            System.out.println("Enter second number");
            int number2 = input.nextInt();

            int sum = number + number2;
            System.out.println("Sum of numbers are " + sum);

            System.out.println("Will you like to continue y/n");
            choice = input.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');

    }

    public static void countNumbers() {
        int countPositive = 0, countNegative = 0, countZero = 0;
        char choice = 0;
        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter numbers");
            int number = input.nextInt();

            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }
            System.out.println("if you wish to continue enter y/n");
        }
        while (choice == 'y' || choice == 'Y');
        {
            System.out.println("Positive numbers are: " + countPositive);
            System.out.println("Negative numbers are: " + countNegative);
            System.out.println("zero's are: " + countZero);
        }
    }

    public static void armstrongNumbers() {
        int digit1, digit2, digit3;
        for (int i = 1; i <= 500
                ; i++) {
            int temp = i;
            digit1 = temp % 10;

            temp = i;
            digit2 = temp % 10;

            temp = i;
            digit3 = temp % 10;

            if (digit1 * digit1 * digit1 + digit2 * digit2 * digit2 + digit2 * digit3 * digit3 == i) {
                System.out.println(i);
                System.out.println(digit1);
                System.out.println(digit2);
                System.out.println(digit3);
            }
        }
    }

    public static void sumOfSeries() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of terms of series: ");
        int number = input.nextInt();

        double sum = 0;
        int i;
        for (i = 1; i <= number; i++) {

            sum += 1.0 / i;
        }
        System.out.println(sum);
    }

    public static void star() {
        int rows = 6;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.println(j + "* ");
            }
            System.out.println();
        }


    }
}

