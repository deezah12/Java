import java.util.Scanner;

public class ArrayBoard {
    private static final char[][] board = new char[3][3];
    private static final Scanner input = new Scanner(System.in);
//    public static void gameBoard(){
//        board[0][0] = 'X';
//        board[0][1] = 'O';
//        board[0][2] = 'X';
//        board[1][0] = 'O';
//        board[1][1] = 'X';
//        board[1][2] = 'O';
//        board[2][0] = 'X';
//        board[2][1] = 'X';
//        board[2][2] = 'O';
//    }

    public  static void element(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println("Enter a symbol");
                char symbol = input.next().charAt(0);
                board[i][j] = symbol;
            }

        }
    }

    public static void main(String[] args) {
        element();
        display();



    }


    private static void display() {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
                if (j != board[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

}
