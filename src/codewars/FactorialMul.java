package codewars;

public class FactorialMul {
    public static int factorial(int n) {
        int fact = 1;
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("invalid number");
        }
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}