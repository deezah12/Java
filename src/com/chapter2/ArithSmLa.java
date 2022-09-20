package com.chapter2;

import java.util.Scanner;

public class ArithSmLa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input .nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        System.out.println("Enter third number");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int product = number1 * number2 * number3;
        int result = number1 + number2 + number3;
        int average = result / 3;


        System.out.println("sum is : " + sum);
        System.out.println("product is : " + product);
        System.out.println("average is : " + average);

    }
}
