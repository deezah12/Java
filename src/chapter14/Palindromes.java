package chapter14;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        StringBuilder pali = new StringBuilder(word);
//        String newWord = pali.reverse().toString();
//        System.out.println(newWord);
//
////        if (newWord.equals(word)) {
////            System.out.printf("%s is palindrome", word);
////        } else {System.out.printf("%s is not palindrome", word);}
//        System.out.printf("%s is %s", word, newWord.equals(word) ? "palindrome" : "not palindrome");

        String newWord = String.valueOf(pali.reverse());
        System.out.printf("%s is %s", word, newWord.equals(word) ? "palindrome" : "not palindrome");

        }
    }

