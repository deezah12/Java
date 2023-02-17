package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DigitCount {
    public static void main(String[] args) {

        List<String> words = List.of("love", "loves", "loves", "lives", "lives", "here");
//        System.out.println(words.stream().reduce("", (x, y) -> x + y).chars().filter(Character::isDigit).count());
//        System.out.println(countingDigit(words));
        Map<String, Integer> map = words.stream().collect(Collectors.toMap((s) -> s, s -> s.length(), (a,b) -> a+b));
        System.out.println(map);
    }

    public static  long countingDigit (List<String> words){
        String digit = "0123456789";
        return  words.stream()
                .flatMap((s) -> Arrays.stream(s.split("")))
                .filter(digit::contains)
                .count();

    }

}
