package chapter7;

public class ArrayCounts {
    public static void main(String[] args) {

        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < integers.length - 10; i++) {
           // i = i * 2;
            for (int j = i * 2; j < integers.length - 10; j++) {
                System.out.println(integers[j]);
            }
        }
    }

}