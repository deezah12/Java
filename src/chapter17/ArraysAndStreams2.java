package chapter17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] color = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        System.out.printf("%nOriginal Strings -> %s", Arrays.asList(color));
        System.out.printf("%nStrings sorted less than n in ascending -> %s",
        Arrays.stream(color)
                .filter(x -> x.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList()));
        System.out.printf("%nStrings sorted less than n in descending -> %s",
        Arrays.stream(color)
                .filter(x -> x.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()));


    }
}
