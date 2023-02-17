package chapter17;

import java.util.stream.IntStream;

public class StreamMapFilterReduce {
    public static void main(String[] args) {
        System.out.printf("The sum is %d", IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum());
    }
}
