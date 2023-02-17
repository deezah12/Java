package chapter17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Instrument instrument = () -> display();
        Instrument piano = () -> display();
        Instrument jazz = () -> display();
        instrument.play();


        Map<Instrument, Integer> map = new HashMap<>();
        map.put(instrument, 4);
        map.put(piano, 2);
        map.put(jazz, 5);

//        List<Integer> list = new ArrayList<>();
//
//        for (Integer n: map.values()) {
//            list.add(n);
//        }
//        System.out.println(list);

        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println();


       // System.out.println(map.get(instrument));



    }

    private static void display() {
        System.out.println("im playing");
        System.out.println("would u like to join me");
    }
}
