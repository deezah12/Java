package codewars;

public class YearsAndPrincipal {

    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years ;
        for (years = 0; desired - principal > 0; years++) {
            principal = principal + (principal * interest) - (principal * interest * tax);
        }

        return years;
    }

    public static void main(String[] args) {
        System.out.println(calculateYears(1000, 0.05, 0.18, 1100));
    }
}