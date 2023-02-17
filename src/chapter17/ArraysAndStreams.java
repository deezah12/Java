package chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        List<Integer> list  = new ArrayList<>(Arrays.asList(values));

        System.out.printf("%nOriginal values are -> %s", list);
        System.out.printf("%nSorted value in ascending order -> %s", Arrays.stream(values)
                .sorted()
               .collect(Collectors.toList()));


        List<Integer> list1 =
                Arrays.stream(values)
                        .filter(x -> x > 4)
                        .sorted().toList();
        System.out.printf("%nValues greater than 4:  %s", list1);
        System.out.printf("%nGreater than 4 list sorted: %s",list1.stream().sorted().toList());
    }
}
