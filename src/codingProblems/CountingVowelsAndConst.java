package codingProblems;

import java.util.*;
import java.util.stream.Collectors;

public class CountingVowelsAndConst {

    public  static Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Map<Integer, Integer> countingVowel(String str){
        str = str.toLowerCase();
        int vowel = 0;
        int constant = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)){vowel++;}
            else if (ch >= 'a' && ch <= 'z') {
                constant++;
            }
        }
        return Map.of(vowel, constant);
    }


    public static Map<Long, Long> countVowel(String str){
        str = str.toLowerCase();
        Long checkV = str.chars().filter(c -> allVowels.contains((char) c)).count();
        Long checkC = str.chars().filter(c -> !allVowels.contains((char) c)).filter(c -> (char)c >= 'a' && c <= 'z').count();
        return Map.of(checkV, checkC);
    }

    public  static Map<Boolean, Long> count(String str){
        str.chars().mapToObj(c -> (char) c).filter(c -> (char) c >= 'a' && c <= 'z').collect(Collectors.partitioningBy(c -> allVowels.contains(c), Collectors.counting()));
        return Map.of();
    }

    public static void main(String[] args) {
        System.out.println(countingVowel("thevbiourwsaz"));
        System.out.println(countVowel("theboyisagirl"));
    }
}
