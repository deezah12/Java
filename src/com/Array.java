package com;

import java.util.Arrays;

public class Array {


    public static void sort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = 0;
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
//        for (int j : array) {
//            System.out.println(j);
        System.out.println(Arrays.toString(array));

        }
    }
