package tic_tac_toe;

import static tic_tac_toe.Mark.*;

public class Player {
    private  Mark mark;

    public Player(Mark mark) {
        this.mark = mark;
    }


    public void playGame(int position,Board board) {
        if (position <= 0 | position > 9)
            throw new ArrayIndexOutOfBoundsException("Position must be within the range of 1 - 9");
        else {
            var boardSurface = board.getBoardSurface();
            int row = 0;
            int col = position - 1;

            if (position > 3) {
                row = 1;
                col = position - 4;
            }
            if (position > 6) {
                row = 2;
                col = position - 7;
            }
//        boardSurface[row][col] = mark;
            if (boardSurface[row][col] == E) {
                boardSurface[row][col] = mark;
            } else {
                throw new RuntimeException("oops!! position has been taken");
            }
        }
    }
}
