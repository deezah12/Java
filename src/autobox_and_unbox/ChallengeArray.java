package autobox_and_unbox;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeArray {
    private  static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInt = getIntegers(5);
        int[] sorted = sortInteger(myInt);
        printArray(sorted);
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + "integer values");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        return values;
    }
    public  static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elements " + i + "contents " + array[i]);
        }
    }
    public static  int[] sortInteger(int[] array){
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
