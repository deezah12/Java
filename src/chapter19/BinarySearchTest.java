package chapter19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {

    public  static  int binarySearch(int[] data, int key){
        int low = 0;
        int high = data.length -1;
        int middle = (low + high +1) / 2;
        int location =-1;

        do {
            System.out.println(remainingElement(data, low, high));

            for (int i = 0; i < middle; i++) {
                System.out.print("-");
            }
            System.out.print(" * ");

            if (key == data[middle]){
                location = middle;
            }
            else if (key < data[middle]){
                high = middle -1;
            }
            else {
                low = middle +1;
            }

            middle = (low + high +1 )/2;
        }
        while ((low <= high) && (location == -1));
        return location;
    }

    private static String remainingElement(int[] data, int low, int high) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < low; i++) {
            temp.append("  ");
        }
        for (int i = low; i <=high ; i++) {
            temp.append(data[i] + " ");
        }
        return String.format("%s%n", temp);
    }

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner input = new Scanner(System.in);


        int[] data = rand.ints(15,10,91).sorted().toArray();
        System.out.printf("%s%n%n", Arrays.toString(data));

        System.out.println("Enter a number or -1 to quit");
        int number = input.nextInt();

        while (number != -1) {
            int location = binarySearch(data, number);

            if (location == -1) {
                System.out.printf("%n%d not found%n%n", number);
            } else {
                System.out.printf("%n%d was found at %d position", number, location);
            }

            System.out.println("Enter a number or -1 to quit");
            number = input.nextInt();
        }
    }
}

