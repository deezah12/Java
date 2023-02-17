package chapter16;

import java.util.Arrays;
import java.util.List;

import static chapter16.ListTest.*;

public class ListTest2 {
    public static void main(String[] args) {
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = Arrays.asList(colors);

        String[] colors1 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = Arrays.asList(colors1);

        list1.addAll(list2);
        printList(list1);

        convertToUpperCaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6....");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }


}
