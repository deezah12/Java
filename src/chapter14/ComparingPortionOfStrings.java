package chapter14;

import java.util.Scanner;

public class ComparingPortionOfStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word1");
        String word1 = input.nextLine();

        System.out.println("Enter word2");
        String word2 = input.nextLine();

        if ( word1.regionMatches(true,2, word2, 0, 4)) {
            System.out.println( "first four of first word character" +
                    " and second word matches ");
        }
        else {
            System.out.println("first four of first word character" +
                    " and second word matches doesnt match ");
        }

        if (word1.equalsIgnoreCase(word2)){
            System.out.printf( "%s  equals %s with case ignored%n", word1, word2);
        }
    }
}
