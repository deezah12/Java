package codewars;

public class DigitPalindrome {
    public boolean isPalindrome(int x) {
        int rem=0;
        int temp = x;
        int sum = 0;

        while(x > 0){
            rem = x % 10;
            sum = (sum * 10) + rem;
            x = x/ 10;
        }
        if(temp == sum){
            return true;
        }

        return false;
    }


}
