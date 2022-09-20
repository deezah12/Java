package codeLife;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(2);
    }

    public  static  void checkNumber(int number){
        if (number > 0 ){
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else if (number == 0) {
            System.out.println(number + " is equal zero");
        }
    }
}
