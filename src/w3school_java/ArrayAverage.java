package w3school_java;

public class ArrayAverage {
    public static void main(String[] args) {
        System.out.println(sums(new int[]{1,2,3,4,5}));
    }

    public  static double  sums(int[] x){
        int sum = 0;
        for (double i : x) {
            sum += i;
        }
        return sum / x.length;
    }
}
