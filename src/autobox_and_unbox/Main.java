package autobox_and_unbox;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "->" + arrayList.get(i).intValue());
        }
        ArrayList<Double> arrayList1 = new ArrayList<Double>();
        for (int i = 0; i < 10.0; i++) {
            arrayList1.add(Double.valueOf(i));
        }
        for (int i = 0; i < 10.0; i++) {
            System.out.println();
        }




//        int[] myInteger = getIntegers(5);
//        for (int i = 0; i < myInteger.length; i++) {
//            System.out.println(myInteger[i]);
//        }
//        System.out.println("the average is "+ getAverage(myInteger));

    }
    public  static int[] getIntegers(int number){
        System.out.println("Enter" + number + "integer values");
        int [] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i]= scan.nextInt();
        }
        return values;
    }
    public  static  double getAverage(int[] array){
        int sum= 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
