package chapter5;

import java.util.stream.IntStream;

public class BarChart {
    public static void display(int number){
       IntStream.rangeClosed(1, number).forEach((x) -> System.out.println(x * x+"*" ));
    }

    public static void main(String[] args) {
        display(7);
    }
}
