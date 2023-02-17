package chapter16;

import java.util.*;

public class WordType {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        createMap(map);
        displayMap(map);
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains: %nKeys\t\t\t%nValues");
        for (String s: sortedKeys) {
            System.out.printf("%-10s%10s%n ", s, map.get(s));
        }
        System.out.printf("%s ", map.size());
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String of words");
        String sentence = input.nextLine();

        String[] tokens = sentence.split(" ");
        for (String token : tokens) {

            String word = token.toLowerCase();
            if (map.containsKey(word)){
                int count = map.get(word);
                map.put(word, count + 1);
            }
            else {
                map.put(word, 1);
            }
        }

    }

}
