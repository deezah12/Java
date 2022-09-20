package chapter11.exception.ivalid_age;

public class Exam {

    static  void checkEligibility(int age) throws InvalidAgeException {
      if (age < 18){
          throw new InvalidAgeException("You are not eligible for the exam");
      }
      else{
          System.out.println("You can proceed for the exam");
      }
    }
}
