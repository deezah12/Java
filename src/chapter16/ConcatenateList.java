package chapter16;

import java.util.Arrays;
import java.util.LinkedList;

public class ConcatenateList {
    public static void main(String[] args) {
        String[] str = {"green", "yellow", "brown"};
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList(str));

        String[] str1 = {"blue", "red", "purple"};
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList(str1));

        ListConcatenate(list2, list1);
        System.out.println(list2);

    }

    private static LinkedList<String> ListConcatenate(LinkedList<String> list2, LinkedList<String> list1) {

        list1.addAll(list2);
        return list1;
    }
}
