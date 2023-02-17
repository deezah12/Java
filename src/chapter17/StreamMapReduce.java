package chapter17;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.printf("The sum of the even number from 2 to 10 is: %d", IntStream.rangeClosed(1, 10)
                .map((int x) -> {return x * 2;})
                .sum());
    }
}
