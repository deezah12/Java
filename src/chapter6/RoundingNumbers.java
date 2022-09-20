package chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double y = Math.floor(9.2 + 0.5);
        System.out.printf("Math.floor(9.2 + 0.5) = %f%n", y);

        double integer = Math.floor(9.2 * 10 + 2.5) / 10;
        System.out.printf("2%f%n", integer);

        double tenths = Math.floor(9.2 * 100 + 2.5) / 100;
        System.out.printf("%f%n",tenths);

        double hundredths = Math.floor(9.2 * 1000 + 2.5) / 1000;
        System.out.printf("%f%n",hundredths);

    }
}
