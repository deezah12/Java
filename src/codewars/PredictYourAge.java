package codewars;

import java.util.stream.IntStream;

public class PredictYourAge {
    public static int predictAge(int... ages) {
        int result = IntStream.of(ages)
                .map(x -> x * x)
                .sum();

        return (int) Math.sqrt(result) / 2;
    }

    public static void main(String[] args) {
        System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));
    }

}
