package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.println("Unsorted Array "+ list);

        Collections.sort(list);
        System.out.println("Sorted Array " + list);

    }
}

