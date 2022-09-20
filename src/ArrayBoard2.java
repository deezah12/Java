public class ArrayBoard2 {
    public static void writeOnBoard() {
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1;
            }
        }
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        writeOnBoard();
    }
}
