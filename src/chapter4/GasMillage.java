package chapter4;

import java.util.Scanner;

public class GasMillage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.println("Enter miles of trip driven or -1 to quit");
        int miles = input.nextInt();

        while (miles != -1) {
            System.out.println("Enter gallons used during the trip or -1 to quit");
            int gallons = input.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            double average = (double) miles / gallons;
            System.out.println("the gas millage for your trip is:" + average);

            double totalAverage = (double) totalMiles / totalGallons;
            System.out.println("the total gas milage for you trip is:" + totalAverage);


            System.out.println("Enter miles of trip driven");
             miles = input.nextInt();

        }
    }
}