package chapter7;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayT {
    public static void main(String[] args) {
        int[][] t = {

                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,12,13}
        };
        IntStream.range(0, t.length)
                .mapToObj(i -> Arrays
                        .stream(t[i])
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ","Content row " + (i + 1) + " : ", "")))
                .forEach(System.out::println);

    }
}
