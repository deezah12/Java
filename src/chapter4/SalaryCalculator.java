package chapter4;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate = input.nextDouble();

        double grossPay = 0;
        double grossPayOver = 0;

        System.out.println("Enter hour worked");
        double hoursWorked = input.nextDouble();

        if (hoursWorked <= 40) {
            grossPay = hourlyRate * hoursWorked;
        }
        else if (hoursWorked > 40) {
            grossPay = hourlyRate * 40;
        }
        if (hoursWorked > 40){
            double rateOfOverWorked = 1.5 * hourlyRate;

            double overTime =  hoursWorked - 40;
            grossPayOver = rateOfOverWorked * overTime;
        }

        double fullpay = grossPay + grossPayOver;

        System.out.println("your full pay for the week is : " + fullpay);




    }
}
