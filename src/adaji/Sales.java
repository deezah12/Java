package adaji;

import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0;
        int n = 0;
        int q;

        System.out.println("Enter product number 1-5 (-1  to stop)");
        n = input.nextInt();

        System.out.println("Enter quantity of product");
        q = input.nextInt();

        while (n != -1 & q != 1) {
            System.out.println("Enter product number 1-5 (-1  to stop)");
            n = input.nextInt();

            System.out.println("Enter quantity of product");
            q = input.nextInt();

        }
        switch (n) {
            case 1 -> sum += 2.98 * q;
            case 2 -> sum += 4.50 * q;
            case 3 -> sum += 9.98 * q;
            case 4 -> sum += 4.49 * q;
            case 5 -> sum += 6.87 * q;
            default -> sum += 0;
        }
        System.out.printf("Total cost is $%.2f", sum);
    }
}


