package chapter2;

import java.util.Scanner;

public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius");
        int r = input.nextInt();

        int circumference = (int) (2 * Math.PI * r);
        int diameter = 2 * r;
        int area = (int) (Math.PI * Math.pow(r,2));

        System.out.printf("%nCircumference of the circle: %d%n", circumference);
        System.out.printf("%nDiameter of the circle: %d%n", diameter);
        System.out.printf("%nArea of the circle: %d%n", area);

    }
}
