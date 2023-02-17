package chapter17;

import java.security.SecureRandom;

public class RandomNumbers {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        System.out.println("even numbers average of 10 random numbers within 0 to 1000: ");
        System.out.println(random.ints(10, 0, 1000)
                .filter(x -> x % 2 == 0)
                .average().getAsDouble());

        System.out.printf("%nOdd numbers from random numbers and their average%n");
        System.out.println(random.ints(10, 0, 1000)
                .filter(x -> x % 2 != 0)
                .summaryStatistics());

        System.out.println("\n");
        System.out.println("random number of 10");
        random.ints(10, 0, 1000)
                .forEach(System.out::println);

    }
}

