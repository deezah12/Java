package w3school_java;

public class IntegersReverse {
    public static void main(String[] args) {
        System.out.println(reverse(23456));
    }
    public static  int reverse(int x){
        int sum = 0;
        while(x != 0){
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        return sum;
    }
}
