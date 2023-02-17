package chapter16;

import java.util.*;

public class Set1 {

    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));
        System.out.println("List" + list);

        printNonDuplicate(list);
    }

    private static void printNonDuplicate(Collection<String> values) {
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNon-Duplicate values are: ");
        for (String value: set) {
            System.out.printf("%s ", value);
        }
        System.out.println();
    }
}
