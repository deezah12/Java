package w3school_java;

import java.util.Arrays;

public class SortNumericAndStringArray {
    public static void main(String[] args) {

        int[] num = {34,5,6,7,8,9,0,2,3,1,4,};
        String[] letters = {"name", "Hadiza", "python", "java"};

        Arrays.sort(num);
        System.out.println("sorted numbers are: " + Arrays.toString(num));

        Arrays.sort(letters);
        System.out.println("sorted strings are: " + Arrays.toString(letters));
    }
}
