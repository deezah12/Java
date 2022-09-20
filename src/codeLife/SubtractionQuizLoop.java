package codeLife;

import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final  int NUMBER_OF_QUESTIONS = 5;
        int correctCount =0;
        int questionCount = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";


        while (questionCount < NUMBER_OF_QUESTIONS){
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() *10);

            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("What is " + number1 + "-" + number2 + "?");
            int answer = input.nextInt();

            if (number1 - number2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n "+  number1 + "-" + number2 + "should be"+
                        (number1 - number2));
            questionCount++;

            output += "\n" + number1 + "-" + number2 + "=" + answer +
                   ((number1 - number2 == answer) ? " correct" : " wrong");

        }

        long endtime = System.currentTimeMillis();
        long testTime = endtime - startTime;

        System.out.println("Correct count is "+ correctCount + "\nTest time is " + testTime/ 1000 + "seconds\n"+ output);
    }
}
