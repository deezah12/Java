package chapter19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearTest {

    public  static int linearSearch(int data[], int searchKey){
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchKey){
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        Scanner scan = new Scanner(System.in);

        int[] data = secureRandom.ints(10,10,91).toArray();
        System.out.printf("%s%n", Arrays.toString(data));

        System.out.println("please enter a number or -1 to quit");
        int searchInt = scan.nextInt();

        while (searchInt != -1) {
            int position = linearSearch(data, searchInt);

            if (position == -1) System.out.printf("%d was not found%n", searchInt);
            else {
                System.out.printf("%d was found at %d position%n", searchInt, position);
            }
            System.out.println("please enter a number or -1 to quit");
            searchInt = scan.nextInt();
        }
    }
}
