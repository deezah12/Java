package chapter14;

import java.util.Scanner;

public class TokenizingTelephoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter a word");
//        String w1 = input.nextLine();
//
//        String[] tokens = w1.split(" ");
//        System.out.printf("Number f elements: %d%n The token are: %n", tokens.length);
//
//        for (String token : tokens) {
//            System.out.println(token);
//        }
        System.out.print("Enter Phone Number: ");
        int num = input.nextInt();
        String w2 = String.valueOf(num);
        String[] token = w2.split("");
        for(int i = 0; i < token.length; i++)
        {
            System.out.print(token[i]);
            if(i == 2)
                System.out.print("-");
        }


    }
}
