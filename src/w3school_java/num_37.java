package w3school_java;

import java.util.Scanner;

public class num_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a String");
        char[] letters = input.nextLine().toCharArray();
        System.out.println("reverse string");
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.print(letters[i]);

        }
        System.out.println("\n");
    }

}
