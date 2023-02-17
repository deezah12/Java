package chapter16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word = input.nextLine();

        SortedSet<String> set = getSortedSet(word);
        System.out.println(set);
    }

    private static SortedSet<String> getSortedSet(String words) {
        String[] sentence = words.split(" ");
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(sentence));
        return sortedSet;
    }
}
