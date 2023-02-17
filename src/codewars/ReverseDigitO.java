package codewars;

public class ReverseDigitO {
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return res;
        }
    }


    public static void main(String[] args) {
        System.out.println(reverse(-1230));
    }
}

