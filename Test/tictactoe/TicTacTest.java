package tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacTest {
    TicTac ticTacToe;
    @BeforeEach
    void setUp() {
        ticTacToe = new TicTac();
    }

    @Test
    void testForPlayers() {
       assertEquals(2,ticTacToe.players());
    }
}