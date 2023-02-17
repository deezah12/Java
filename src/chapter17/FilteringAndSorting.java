package chapter17;

import java.security.SecureRandom;

public class FilteringAndSorting {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        random.ints(50, 1,999)
                .filter(x -> x % 2 == 0)
                .sorted()
                .forEach(System.out::println);

    }
}
