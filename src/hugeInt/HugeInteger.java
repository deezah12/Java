package hugeInt;

public class HugeInteger {
    private final int digit = 40;
    private int[] numbers;


    public HugeInteger() {
        numbers = new int[digit];
    }

    public HugeInteger(String value) {
        this();
        this.parse(value);
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void parse(String value) {
        if ((value.length() <= digit) && (value.length() > 0)) {
            for (int i = 1; i <= value.length(); i++) {
                int charDigit = value.length() - i;
                if (Character.isDigit(value.charAt(charDigit))) {
                    Character.getNumericValue(value.charAt(charDigit));
                } else {
                    System.out.println("parse failed: value must consist of numeric characters only.");
                }
            }
        } else {
            System.out.printf("parse failed: value must contain %d or fewer characters", digit);
        }
    }

    public static HugeInteger add(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int sum = 0;
        int carrier = 0;
        int count = 0;

        while (count >= 0) {
             sum += hugeInteger1.numbers[count] + hugeInteger2.numbers[count] + carrier;
            if (sum > 9) {
                int div = sum / 10;
                int mod = sum % 10;
                carrier = div;
                sum += mod;
            } else {
                carrier = 0;
                sum +=  carrier;
            }
            hugeInteger1.numbers[count] = sum;
        }
        return hugeInteger1;
    }

    public static void main(String[] args) {
        HugeInteger hugeInteger = new HugeInteger("2345");
        HugeInteger hugeInteger1 = new HugeInteger("2345");

    }
}


