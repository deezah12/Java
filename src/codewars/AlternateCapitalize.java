package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlternateCapitalize {
    public  static String[] capitalize(String s){
        String first = IntStream.range(0, s.length())
                .map(x -> x % 2 == 0 ? Character.toUpperCase(s.charAt(x)) : s.charAt(x))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());

        String second = IntStream.range(0, s.length())
                .map(x -> x != 0 ? Character.toUpperCase(s.charAt(x)) : s.charAt(x))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        return new String[]{first, second};
    }

    public static void main(String[] args) {
        System.out.println((Arrays.toString(capitalize("abcdef"))));
    }
}

