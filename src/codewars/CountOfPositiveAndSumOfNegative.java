package codewars;

import java.util.Arrays;

public class CountOfPositiveAndSumOfNegative {

    public static int[] countPositivesSumNegatives(int[] input) {
        return  input.length == 0 || input == null ? new int[0] : new int[] {(int) Arrays.stream(input).filter(x -> x > 0).count(),
                                                                                   Arrays.stream(input).filter(x -> x < 0).sum()};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives((new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}))));
    }
}
