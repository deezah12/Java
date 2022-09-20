package chapter11.exception.ivalid_age;

import java.util.Scanner;

import static chapter11.exception.ivalid_age.Exam.checkEligibility;
import static org.junit.jupiter.api.Assertions.*;

class ExamTest {
    public static void main(String[] args) throws InvalidAgeException {

        Scanner input = new Scanner(System.in);

        int age;
        System.out.println("Enter your age");
        age = input.nextInt();


        try {
            checkEligibility(age);
        } catch (InvalidAgeException exception) {
            System.out.println("Exception found");

            System.out.println(exception);
        }
    }
}