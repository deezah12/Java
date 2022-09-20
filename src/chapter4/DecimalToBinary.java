package chapter4;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary integer");
        int binary = input.nextInt();

        int decimal = 0;
        int number = binary;
        int counter = 0;
        while (number > 0){

            int remainder = number % 10;
            number /= 10;

            decimal += remainder * Math.pow(2, counter);
            counter++;
        }
        System.out.printf("%n%d%n in binary is %d in decimal %n", binary,decimal);
    }
}