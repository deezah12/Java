package chapter16;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        String[] colors = {"yellow", "green", "black", "tan", "grey",
                "white", "orange", "red", "green"};
        SortedSet<String> set = new TreeSet<>(Arrays.asList(colors));
        System.out.println("The sorted colors are: " + set);

        System.out.print("HeadSet (Orange): ");
        printSet(set.headSet("orange"));

        System.out.print("TailSet (Orange): ");
        printSet(set.tailSet("orange"));

        System.out.printf("First:  %s ", set.first());
        System.out.printf("%nLast:  %s ", set.last());


    }

    private static void printSet(SortedSet<String> set) {
        for (String s : set) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
