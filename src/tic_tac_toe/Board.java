package tic_tac_toe;

import static tic_tac_toe.Mark.*;

public class Board {
    private Mark[][] boardSurface = {{E,E,E},{E,E,E},{E,E,E}};

    public Mark[][] getBoardSurface() {
        return boardSurface;
    }

    public void setBoardSurface(Mark[][] boardSurface) {
        this.boardSurface = boardSurface;
    }


    public void displayBoardSurface() {
        for (int i = 0; i < 3; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(boardSurface[i][j]);
                    System.out.print(" | ");
             }
            System.out.println();
        }
    }


    private boolean isAWinnerOnRowZero() {
        boolean isX = boardSurface[0][0] == X && boardSurface[0][1] == X && boardSurface[0][2] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[0][1] == O && boardSurface[0][2] == O;
        if (isX | isO) return true;
        else return false;
    }

    private boolean isAWinnerOnRowOne(){
        boolean isX = boardSurface[1][0] == X && boardSurface[1][1] == X && boardSurface[1][2] == X;
        boolean isO = boardSurface[1][0] == O && boardSurface[1][1] == O && boardSurface[1][2] == O;
        if (isX | isO) return true;
        else return false;
    }

    private boolean isAWinnerOnRowTwo(){
        boolean isX = boardSurface[2][0] == X && boardSurface[2][1] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[2][0] == O && boardSurface[2][1] == O && boardSurface[2][2] == O;
        if (isX | isO) return true;
        else return false;
    }
    private boolean isAWinnerOnColumnZero(){
        boolean isX = boardSurface[0][0] == X && boardSurface[1][0] == X && boardSurface[2][0] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[1][0] == O && boardSurface[2][0] == O;
        if (isX | isO) return true;
        else return false;
    }
    private boolean isAWinnerOnColumnOne(){
        boolean isX = boardSurface[0][1] == X && boardSurface[1][1] == X && boardSurface[2][1] == X;
        boolean isO = boardSurface[0][1] == O && boardSurface[1][1] == O && boardSurface[2][1] == O;
        if (isX | isO) return true;
        else return false;
    }
    private boolean isAWinnerOnColumnTwo(){
        boolean isX = boardSurface[0][2] == X && boardSurface[1][2] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[0][2] == O && boardSurface[1][2] == O && boardSurface[2][2] == O;
        if (isX | isO) return true;
        else return false;
    }
    private boolean isAWinnerOnDiagonalZero(){
        boolean isX = boardSurface[0][0] == X && boardSurface[1][1] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[1][1] == O && boardSurface[2][2] == O;
        if (isX | isO) return true;
        else return false;
    }
    private boolean isAWinnerOnDiagonalTwo(){
        boolean isX = boardSurface[0][2] == X && boardSurface[1][1] == X && boardSurface[2][0] == X;
        boolean isO = boardSurface[0][2] == O && boardSurface[1][1] == O && boardSurface[2][0] == O;
        if (isX | isO) return true;
        else return false;
    }
    public boolean isAWinner(){
        if (isAWinnerOnRowZero()) return true;
        if (isAWinnerOnRowOne()) return  true;
        if (isAWinnerOnRowTwo()) return true;
        if (isAWinnerOnColumnZero()) return true;
        if (isAWinnerOnColumnOne()) return true;
        if (isAWinnerOnColumnTwo()) return true;
        if (isAWinnerOnDiagonalZero()) return  true;
        if (isAWinnerOnDiagonalTwo()) return true;
        else return false;
    }
    private boolean isNotE(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (boardSurface[i][j] == E) return true;

            }
        }
        return false;
    }
    public  boolean isATie(){
        if (!isAWinner() && !isNotE()) {
            return  true;
        }
        return false;
    }
}




