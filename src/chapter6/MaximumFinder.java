package chapter6;
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter floating numbers(i.e 1.2) with spaces:");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);
        System.out.println("Maximum value is: " + result);
    }

    public  static  double maximum(double x, double y, double z){

        double maximumValue = x;
        if (y > x){
            maximumValue = y;
        }
        if (z > y){
            maximumValue = z;
        }
        // second method using  Math.max()
       // maximumValue = Math.max(x, Math.max(y, z));

        return maximumValue;
    }
}
