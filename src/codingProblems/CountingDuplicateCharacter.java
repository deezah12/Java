package codingProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicateCharacter {

    public static Map<Character, Integer> duplicates(String character){
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : character.toCharArray()) {
            result.compute(ch, (x,y) -> (y == null)? 1 : ++y);
        }
        return result;
    }
    public static Map<Character, Long> repetition(String character){
        Map<Character, Long> map = character.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return map;
    }


    public static void main(String[] args) {
        System.out.println(repetition("hadizaaaaaakayy"));
    }
}
