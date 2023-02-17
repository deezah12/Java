package w3school_java;

public class CodeWar {
    public static void main(String[] args) {
        //System.out.println(pick(new int[]{2, 4, 6, 7, 8, 10}));
        System.out.println(pick(new int[]{3,5,7,9,8}));
       // chk(new int[]{3,5,7,9,8});
    }

    public static int pick(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
            } else if (arr[i] % 2 == 0) {
               // result = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                result = arr[i];
            }
        }
        return result;
    }

    public static  int pick2(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                result = arr[i];
            }
        }
        return result;
    }
    public  static  void chk(int[] x){
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0){
                System.out.println(x[i]);
            }
        }
    }

}
