package chapter16;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addFirst("violet");
        links.addLast("grey");
        links.add("orange");
        links.add("brown");

        colors = links.toArray(new String[ links.size()]);

        System.out.println("colors: ");
        for (String color : colors) {
            System.out.println(color);
        }

    }
}
