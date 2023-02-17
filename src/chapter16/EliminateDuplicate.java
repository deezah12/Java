package chapter16;

import java.util.*;

public class EliminateDuplicate {
    public static void main(String[] args) {

        String fName;
        String[] names = new String[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        List<String> list = Arrays.asList(names);

        System.out.printf("%s \n", list);

        removeDuplicate(list);


    }

    private static void removeDuplicate(Collection<String> values) {
        Set<String> set = new TreeSet<>(values);
        System.out.println("non- duplicated values are: " + set);

    }

    public static boolean searchForName(Collection<String> names, String someName)
    {
        Set<String> set = new HashSet<String>(names);
        return set.contains(someName);

    }

}