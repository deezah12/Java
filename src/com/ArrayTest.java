package com;


import codeLife.ArraySorting;

import java.util.Arrays;

import static com.Array.sort;

public class ArrayTest {
        public static void main(String[] args) {
            int[] array = {2,9,4,5,6,7,1};
            sort(array);

            System.out.println(Arrays.toString(ArraySorting.sortNumericArray1(array)));
        }

}
