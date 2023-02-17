package chapter16;

import java.util.Scanner;

public class PrimeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        primeFactor(num);
    }
    public  static int primeFactor(int number) {
        int count = 0;
        for (int i = 0; i <= number; i++) {
            if (number % i == 0){
                count++;
            }
        }

        return count;
    }
}
