import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {


        Integer[] ints = {2, 5, 7, 9, 1, 4, 5, 3};
        List<Integer> list = new ArrayList<>(Arrays.asList(ints));
        System.out.println("Original values are " + list);

        System.out.printf("%nSorted arrays in ascending order -> %s", Arrays.stream(ints)
                .sorted().toList());
        System.out.printf("%nSorted array in descending order -> %s", Arrays.stream(ints)
                .sorted(Comparator.reverseOrder()).toList());

    }
}