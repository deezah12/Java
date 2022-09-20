package DieteExamples;
import java.util.Scanner;


public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        System.out.println("Enter your guess number");
        String guess = input.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        System.out.println("the lottery number is "+ lottery);
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        if (guess.equals(lottery)){
            System.out.println("Exact match: you won $10000");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match all digit: you won $3000");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit2
                || guessDigit2 == lotteryDigit1) {
            System.out.println("Match one digit: you won $1000");
        }
        else
            System.out.println("sorry you lost");
    }
}

