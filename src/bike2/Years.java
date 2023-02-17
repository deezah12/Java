package bike2;

import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        int years = 525_600;
        int days = 1440;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter minutes");
        int min = input.nextInt();

        int year = min / years;
        int day = (min % years) / days;
        System.out.printf("%n year = %d%n day = %d%n minutes = %d%n", year, day, min);
    }
}
