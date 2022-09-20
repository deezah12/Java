package chapter14;

import java.util.Scanner;

public class ReversedWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        String[] tokens = word.trim().split("");

        for (String token :tokens) {
            System.out.println(token);
        }

        StringBuilder wrd = new StringBuilder(word);
        String newWord = wrd.reverse().toString();
        System.out.println(newWord);


    }
}
