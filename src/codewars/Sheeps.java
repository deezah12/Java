package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sheeps {
    public static String countingSheep(int num) {
       var t=  IntStream.rangeClosed(1, num)
                .mapToObj( n -> ""+n+" sheep..." )
                .collect(Collectors.joining());
        return t;
    }

}
