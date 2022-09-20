package com.chapter3;

import java.util.Scanner;

public class ComparisonUsingFor {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int number  = input.nextInt();

        int maxNum = number;
        int minNum = number;

        for (int i = 1; i < 5 ; i++) {
            System.out.println("Enter number");
            number = input.nextInt();

            if (number >maxNum) {
                maxNum = number;
            }
            if (number < minNum) {
                minNum = number;
            }

        }

        System.out.println(maxNum +" is highest number" );
        System.out.println(minNum +" is lowest number");

    }
}
