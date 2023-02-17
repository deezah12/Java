package w3school_java;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] my_array = {2,3,4,5,2,3,4,5,3,2};

        Arrays.sort(my_array);
        int index = my_array.length-1;
        while (my_array[index] == my_array[my_array.length-1]){index--;}
        System.out.println("second largest value is : "+ my_array[index]);
    }
}
