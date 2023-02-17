package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algoritms1 {
    public static void main(String[] args) {
        Character[] letters = {'p', 'w', 'c'};
            List<Character> list = Arrays.asList(letters);
            System.out.println("list contains");
            output(list);
        Collections.reverse(list);
        System.out.println("Reversed list: ");
        output(list);

        Character[] copyLetters = new Character[3];
            List<Character> copyList = Arrays.asList(copyLetters);
            Collections.copy(copyList, list);
        System.out.println("after copying the copy list contains");
        output(copyList);

        Collections.fill(list, 'R');
        System.out.println("list after adding R");
        output(list);


    }

    private static void output(List<Character> list) {
        System.out.println("The list is: ");
        System.out.println("\r");
        for (Character elements: list) {
            System.out.printf("%s ", elements);
        }

        System.out.printf("max is %s ", Collections.max(list));
        System.out.println("\r");
        System.out.printf("min is %s ", Collections.min(list));

    }

}
