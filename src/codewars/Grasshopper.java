package codewars;

import java.util.Arrays;

public class Grasshopper {

    public static int findAverage(int[] nums) {

        return ((int) Arrays.stream(nums).summaryStatistics().getAverage());
    }
}
