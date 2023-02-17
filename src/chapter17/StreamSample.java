package chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamSample {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.empty();
        Integer[] elements = {2,3,4,5,6,7,8,9};
        Stream<Integer> integerStream1 = Arrays.stream(elements);

        Stream<Integer> nums = Stream.generate(() -> new Random().nextInt());
        nums.limit(5);
                //.forEach(System.out::println);

        List<Integer> list = List.of(1,2,3,4,5,6);
        var check = list.stream()
                .map(n -> n*2)
                .reduce(0, Integer::sum);
       // System.out.println(check);

        List<Integer> list1 = List.of(1,3,4,5,6);
        list1.stream()
                .mapToInt((n) -> n * 2)
                 .mapToObj(n ->n)
                .forEach(System.out::println);



    }
}
