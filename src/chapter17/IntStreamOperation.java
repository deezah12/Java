package chapter17;

import java.util.stream.IntStream;

public class IntStreamOperation {
    public static void main(String[] args) {
        int[] values = {4, 3, 2, 34, 66, 7, 8, 9, 96, 25};

//        System.out.print("The original values of the array ");
//        System.out.println(IntStream.of(values)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining(" ")));
         System.out.println(IntStream.of(values).summaryStatistics());
//        System.out.printf("%nSum via reduce methods: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));
//        System.out.printf("%nProduct via reduce methods: %d%n", IntStream.of(values).reduce((x, y) -> x * y).getAsInt());
//        System.out.printf("%nCount: %d%n ", IntStream.of(values).count());
//        System.out.printf("Min: %d%n ", IntStream.of(values).min().getAsInt());
//        System.out.printf("Max: %d%n ", IntStream.of(values).max().getAsInt());
//        System.out.printf("Average: %.2f%n ", IntStream.of(values).average().getAsDouble());
//          System.out.printf("Values displayed in ascending order %s", IntStream.of(values)
//                .sorted()
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining(" ")));



    }
}
