package chapter11.exception;

public class TestCustomException1 {
 static void validate(int dateOfBirth) throws InvalidDateOfBirthException {
  if (dateOfBirth == 00 - 00 - 0000) {
   throw new InvalidDateOfBirthException("date of birth is invalid");
  } else {
   System.out.println("welcome to Semicolon");
  }
 }


 public static void main(String[] args) {
  {
   try {
    validate(00 - 00 - 00);
   } catch (InvalidDateOfBirthException ex) {
    System.out.println("Exception occurred: " + ex);
   }
   System.out.println("rest Date of birth format");
  }
 }
}

