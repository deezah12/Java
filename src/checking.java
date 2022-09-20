public class checking {
    static int[][] board = new int[5][4];
    public static void display() {
        for (var i : board) {
            for (var j : i) {
                if (j == 1) {
                    System.out.print("# ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       checking.display();
    }

}
