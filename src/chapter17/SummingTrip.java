package chapter17;

import java.util.stream.IntStream;

public class SummingTrip {
    public static void main(String[] args) {

        System.out.println(IntStream.rangeClosed(2, 10)
                // .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum());
    }
}
