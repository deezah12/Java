package w3school_java;

public class MaxMin {
    public static void main(String[] args) {
        int [] nah = {1,23,4,5,6};
        System.out.println(max(nah));
        System.out.println(min(nah));
    }
    public static int max(int[] x){
        int max = x[0];
        for (int i : x) {
            if (i > max){
             max = x[i];
            }
        }
        return max;
    }
    public  static int min(int [] y){
        int min = y[0];
        for (int i : y) {
            if (i < min){
                min = y[i];
            }
        }
        return min;
    }
}
