package chapter4;

import java.util.Scanner;

public class SalesCommissionCal{

        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);

            double salary = 200;
            double itemA = 239.99;
            double itemB = 129.75;
            double itemC = 99.95;
            double itemD = 350.89;


            System.out.println("Enter salesPerson name:");
            String salesPerson = input.nextLine();

            System.out.println("Enter number of ItemA sold:");
            int numA = input.nextInt();

            System.out.println("Enter number of itemB sold:");
            int numB = input.nextInt();

            System.out.println("Enter number of itemC sold:");
            int numC = input.nextInt();

            System.out.println("Enter number of itemD sold:");
            int numD = input.nextInt();

            double valueA = numA * itemA;
            double valueB = numB * itemB;
            double valueC = numC * itemC;
            double valueD = numD * itemD;

            double grossSales = valueA + valueB + valueC + valueD;
            double commission = grossSales * 0.9;

            double newPay = commission + salary;

            System.out.printf("%s you made a gross sale of : %.2f%n, with  commission of %.2f%n" + "your new take home is: %.2f%n",
                    salesPerson, grossSales, commission, newPay);
        }

    }

