package codewars;

import java.util.Arrays;

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit)
    {
        //return Arrays.stream(a).allMatch(x ->  x <= limit);
        return Arrays.stream(a).noneMatch(x -> x > limit);
    }

    public static void main(String[] args) {
        System.out.println(smallEnough(new int[] {66, 101 }, 200));
        System.out.println(smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
    }
}
