package chapter11.exception.already_exist;


import list.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static chapter11.exception.already_exist.Language.checkExistence;

;

class LanguageTest {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript");
        Scanner input = new Scanner(System.in);

        String lang;

        System.out.println("Enter language ");
        lang = input.nextLine();

        try {
            checkExistence((ArrayList<String>) languages, lang);
        } catch (AlreadyExistException e) {
            System.out.println("we found an exception");
            System.out.println(e);
        }
    }
}