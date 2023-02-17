package codewars;

import java.util.Arrays;

public class CubiodVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        var num1 = Arrays.stream(firstCuboid).reduce(1, (j, y) -> (j * y));
        var num2 = Arrays.stream(secondCuboid).reduce(1, (j, y) -> (j * y));

        return num1 - num2;
    }
}