 package com.chapter3;

import java.util.Scanner;

public class ComparisonUsingWhile{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number ");
        int number  = userInput.nextInt();

        int largestNumber = number;
        int lowestNumber = number;

        int count = 1;
        while (count < 5) {


            System.out.println("Enter number");
            number = userInput.nextInt();

            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < lowestNumber) {
                largestNumber = number;
            }
            ++count;


        }

        System.out.println(largestNumber +" is largest number" );
        System.out.println(lowestNumber +" is lowest number");

}
}
