package chapter14;

public class CreditCardNumberValidation {

    public static  int doubleEvenDigit(long cardNumber){
        int sum =0;
        String num = cardNumber + "";
        for (int i = getSize(cardNumber); i >= 0; i -=2) {
            sum += getDigit();
        }
        return sum;
    }

    private static int getDigit() {

        return 0;
    }

    private static int getSize(long cardNumber) {
        return 0;
    }

}
