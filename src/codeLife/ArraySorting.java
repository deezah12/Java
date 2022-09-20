package codeLife;

public class ArraySorting {
    public static int []  sortNumericArray1(int[] array1){
        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j < array1.length ; j++) {
                int temp = 0;
                if (array1[i] < array1[j]){
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }

        }
        return array1;
    }
}
