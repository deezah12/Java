package chapter17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.printf(" Sum of 1 through 10 is %s\n", IntStream.rangeClosed(1, 10).sum());
        System.out.printf("Sum of 1 through 10 is %s\n", IntStream.range(1, 10).sum());
        System.out.printf("kayode %s\n", IntStream.rangeClosed(1, 10).sum());
        System.out.println("kayode ");
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
        IntStream.range(1, 10).forEachOrdered(System.out::println);
    }
}
