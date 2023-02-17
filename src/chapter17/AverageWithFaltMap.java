package chapter17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageWithFaltMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();


        List<Integer> list = new ArrayList<>(num);
        System.out.println(list.stream().toList().stream().reduce(0, Integer::sum));
    }
}
