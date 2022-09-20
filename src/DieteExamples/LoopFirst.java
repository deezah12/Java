package DieteExamples;

public class LoopFirst {

    public static void main(String[] args) {
        int rows = 5, number = 0;

        for (int counter = 1; counter <= rows; ++counter, number = 0) {
            for (int space = 1; space <= rows - counter; ++space) {
                System.out.print("  ");
            }

            while (number != 2 * counter - 1) {
                System.out.print("* ");
                ++number;
            }

            System.out.println();
        }
    }
}


