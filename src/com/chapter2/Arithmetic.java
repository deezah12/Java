package com.chapter2;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Integer");
       int number1 = input.nextInt();

        System.out.println("Enter second Integer");
        int number2 = input .nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number2 - number1;
        int division = number2 / number1;

        System.out.println("sum is : " + sum);
        System.out.println("product is: " + product);
        System.out.println("difference is: " + difference);
        System.out.println("quotient is: " + division);
    }
}

