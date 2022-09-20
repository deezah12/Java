package turtleTest;

import turtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    void setUp(){
        ijapa = new Turtle();
    }

    @Test
    void turtleHasPen(){
        assertNotNull(ijapa);
        //assertNull(ijapa.getTurtlePen());
        assertEquals(0, ijapa.getTurtlePen());
     //   assertEquals(0, ijapa.getXCoordinate());
    }

}
