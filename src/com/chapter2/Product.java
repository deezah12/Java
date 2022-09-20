package com.chapter2;

import java.util.Scanner;


public class Product {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.println("Enter first Integer");
        x = input.nextInt();

        System.out.println("Enter second Integer");
        y = input.nextInt();

        System.out.println("Enter third Integer");
        z = input.nextInt();

        int result = x * y * z;
        System.out.println("product is: " + result);
    }
}
