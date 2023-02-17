package tic_tac_toe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tic_tac_toe.Mark.*;

class PlayerTest {
    private Player player1;

    private Player player2;
    private Board board;
    private Mark[][] boardSurface;


    @BeforeEach
    void setUp() {

        player1 = new Player(X);
        player2 = new Player(O);
        board = new Board();
        boardSurface = board.getBoardSurface();

    }

    @Test
    void testThatBoardCellsAreEmpty() {
//        var boardSurface = board.getBoardSurface();
        assertEquals(E, boardSurface[0][0]);
        assertEquals(E, boardSurface[2][2]);
        assertEquals(E, boardSurface[1][2]);
        assertEquals(E, boardSurface[1][1]);
    }

    @Test
    void testThatBoardCanBeDisplayed() {
        board.displayBoardSurface();
    }

    @Test
    void testThatXAppearsWhenPlayer1Plays() {
        player1.playGame(1, board);
//        var boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[0][0]);

        player1.playGame(2, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[0][1]);

        player1.playGame(3, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[0][2]);

        player1.playGame(4, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][0]);

        player1.playGame(5, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][1]);

        player1.playGame(6, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][2]);

        player1.playGame(7, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][0]);

        player1.playGame(8, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][1]);

        player1.playGame(9, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][2]);

        board.displayBoardSurface();
    }

    @Test
    void testThatOApppearsWhenPlayer2Plays() {
//        var boardSurface = board.getBoardSurface();

        for (int i = 1; i < 10; i++) {
            player2.playGame(i, board);

        }
        assertEquals(O, boardSurface[0][0]);
        assertEquals(O, boardSurface[0][1]);
        assertEquals(O, boardSurface[0][2]);
        assertEquals(O, boardSurface[1][0]);
        assertEquals(O, boardSurface[1][1]);
        assertEquals(O, boardSurface[1][2]);
        assertEquals(O, boardSurface[2][0]);
        assertEquals(O, boardSurface[2][1]);
        assertEquals(O, boardSurface[2][2]);
    }

    @Test
    void testSamePositionCantBePlayedTwice(){
//        var boardSurface = board.getBoardSurface();
        player1.playGame(3, board);
        assertThrows(RuntimeException.class, ()-> player2.playGame(3, board));
        assertEquals(X, boardSurface[0][2]);
    }
    @Test
    void testThatAnExceptionIsThrownIfAPlayerPlayOutOfBound(){

        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> player1.playGame(10, board));
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> player2.playGame(10, board));

    }

    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossRow0() {
        for (int i = 1; i < 4; i++) {
            player2.playGame(i, board);

        }
        assertEquals(O, boardSurface[0][0]);
        assertEquals(O, boardSurface[0][1]);
        assertEquals(O, boardSurface[0][2]);

        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossRow1(){
        player1.playGame(4, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][0]);

        player1.playGame(5, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][1]);

        player1.playGame(6, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][2]);

        assertTrue(board.isAWinner());
    }

    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossRow2() {
        player1.playGame(7, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][0]);

        player1.playGame(8, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][1]);

        player1.playGame(9, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][2]);

        assertTrue(board.isAWinner());
    }

    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossColumn1() {
        player1.playGame(1, board);
        assertEquals(X, boardSurface[0][0]);

        player1.playGame(4, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][0]);

        player1.playGame(7, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][0]);

        assertTrue(board.isAWinner());
    }

    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossColumn2() {
        player1.playGame(2, board);
        assertEquals(X, boardSurface[0][1]);

        player1.playGame(5, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][1]);

        player1.playGame(8, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][1]);

        assertTrue(board.isAWinner());
    }

    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossColumn3() {
        player1.playGame(3, board);
        assertEquals(X, boardSurface[0][2]);

        player1.playGame(6, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][2]);

        player1.playGame(9, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][2]);

        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossDiagonal0() {
        player1.playGame(1, board);
        assertEquals(X, boardSurface[0][0]);

        player1.playGame(5, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][1]);

        player1.playGame(9, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][2]);

        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossDiagonal2() {
        player1.playGame(3, board);
        assertEquals(X, boardSurface[0][2]);

        player1.playGame(5, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[1][1]);

        player1.playGame(7, board);
        boardSurface = board.getBoardSurface();
        assertEquals(X, boardSurface[2][0]);

        assertTrue(board.isAWinner());
    }

    @Test
    void testWhenIsATie() {
        player1.playGame(1, board);
        player1.playGame(2, board);
        player1.playGame(6, board);
        player1.playGame(7, board);
        player1.playGame(9, board);

        player2.playGame(3, board);
        player2.playGame(4, board);
        player2.playGame(5, board);
        player2.playGame(8, board);

        assertTrue(board.isATie());

    }
}
