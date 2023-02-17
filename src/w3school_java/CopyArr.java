package w3school_java;

import java.util.Arrays;

public class CopyArr {
    public static void main(String[] args) {
    int[] initial = {1,2,3,4,5};
    int[] dest = new int[5];

        for (int i = 0; i < initial.length; i++) {
            dest[i] = initial[i];
        }
        System.out.println(Arrays.toString(dest));
    }

}
