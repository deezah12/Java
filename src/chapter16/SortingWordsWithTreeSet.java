package chapter16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingWordsWithTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word = sc.nextLine();

        TreeSet<String> set = getSortedSet(word);
        System.out.println(set);
    }

    private static TreeSet<String> getSortedSet(String word) {
        String[] sentence = word.split(" ");
        TreeSet<String> tree = new TreeSet<>(Arrays.asList(sentence));
        return tree;
    }
}
