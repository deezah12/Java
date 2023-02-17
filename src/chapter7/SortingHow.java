package chapter7;

import static java.util.stream.IntStream.range;

public class SortingHow {

//    public static int average(int... numbers) {
//        return IntStream.rangeClosed(0, numbers.length).reduce(0, Integer::sum) / 2;
//
//
//    }

    public static String isSortedAndHow(int[] array) {
//        return range(1, array.length).allMatch(i -> array[i - 1] < array[i]) ? "yes, ascending" :
//                range(1, array.length).allMatch(i -> array[i - 1] > array[i]) ? "yes, descending" : "no";
//    return range(1, array.length).noneMatch(i -> array[i - 1] > array[i]) ? "yes, ascending" :
//                range(1, array.length).noneMatch(i -> array[i - 1] < array[i]) ? "yes, descending" : "no";
    return range(1, array.length).noneMatch(i ->  array[i] < array[i - 1]) ? "yes, ascending" :
                range(1, array.length).noneMatch(i ->  array[i] > array[i - 1]) ? "yes, descending" : "no";
    }




    public static void main(String[] args) {

        System.out.println(isSortedAndHow(new int[]{1,2,3}));

    }
}

