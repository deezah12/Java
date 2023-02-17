package w3school_java;

public class Grind {
    public static void main(String[] args) {
        int[][] x = new int[10][10];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.printf("%2d",x[i][j]);
            }
            System.out.println();
        }
    }
}
