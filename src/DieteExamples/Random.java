package DieteExamples;

        import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        SecureRandom randomnumber = new SecureRandom();

        for (int i = 1; i <= 15; i++){
            int face = 1 + randomnumber.nextInt(6);
            System.out.printf("%d ", face);

            if (i %5 == 0){
                System.out.println();
            }
        }
    }

}

