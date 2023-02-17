package adaji;

public class SegLed {
    static int[][] board = new int[5][4];

    public static void main(String[] args) {
        display();
    }


    public static void display() {
        for (int[] i : board) {
            for (int j : i) {
                System.out.print("# ");
            }
            System.out.println("  ");
        }
    }

    public static void setBoard(String input) {
        if (input.length() > 8) {
            input = input.substring(0, 8);
        }

        char[] ch = input.toCharArray();
        for (char i : ch) {
            if (!(i == '1' || i == '0')) {
                throw new IllegalArgumentException(" input must be  1 or 0");
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                switch (i) {

                }
            }
        }

    }
}

