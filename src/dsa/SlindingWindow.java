package dsa;

public class SlindingWindow {
    public static void main(String[] args) {
       // maxNum(new int[]{1,4,2,10,23,3,1,0,20}, 4);
        maxNumber(new int[]{1,4,2,10,23,3,1,0,20}, 4);
    }

    public static void maxNum(int[] num, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < num.length ; i++) {
            sum += num[i];
            for (int j = i + 1 ; j < i + k; j++) {
                if (i < 5){
                    sum += num[j];
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
    public static void maxNumber(int[] num, int k){
        int maximum = 0;
        int sum = 0;
        for (int i = 0; i < num.length-k ; i++) {
           maximum = num[i] + num[i + 4];
          //  sum = maximum + (num[k] - num[k - 1]);


        }
        System.out.println(maximum);
    }
}
