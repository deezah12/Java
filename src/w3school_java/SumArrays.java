package w3school_java;

public class SumArrays {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
//        int sum = 0;
//
//        for (int i : arr) {
//            sum += i;
//        }
//            System.out.println(sum);

        sum(arr);
    }
    public  static  void sum(int[] x){
        int sum = 0;
        for (int i:x) {
            sum += i;
        }
        System.out.println(sum);
    }
}
