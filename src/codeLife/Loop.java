package codeLife;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void sumNumbers() {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);
    }

    public static void multiplication() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " * " + i + " = " + (number * 1));
        }
    }

    public static void factorial() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void power() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number power");
        int power = input.nextInt();

        System.out.println("Enter base number");
        int base = input.nextInt();

        int results = 1;

        for (int i = 1; i <= power; i++) {
            results *= base;
        }
    }

    public static void reverse() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some  numbers");
        int number = input.nextInt();
        int reverse = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println(reverse);
    }

    public static void evenAndOdd() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter set of integer");
        int number = input.nextInt();


        int evenSum = 2;
        int oddSum = 1;

        do {
            if (number % 2 == 0) {
                evenSum = number;
            } else {
                oddSum = number;
            }

        }
        while (number != 0);
        System.out.println("sum of even numbers are: " + evenSum);
        System.out.println("sum of odd numbers are: " + oddSum);
    }

    public static int factor(int number) {
        int addedNumber = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                addedNumber++;
            }
        }

        return addedNumber;
    }


}