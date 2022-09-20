package com.chapter2;

import java.util.Scanner;

public class ComparingInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        if (number1 < number2)
            System.out.println(" second number is larger than first number");
        if (number1 > number2)
            System.out.println(" firsts number is larger than the second number");


        if (number1 == number2)
            System.out.println("These numbers are equal");
    }



}
