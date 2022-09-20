package turtle1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle1.Direction.*;

public class TurtleTest {
    private Turtle ijapa;
    SketchPad sketchPad;

    @BeforeEach
    void setUp(){
        ijapa = new Turtle();
        sketchPad = new SketchPad(5,5);
    }

    @Test
    public void thereIsATurtle(){
        assertNotNull(ijapa);
    }

    @Test
    public void testTurtleCanMovePenUp(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanMovePenDown(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());

        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingEastAndPenIsuP(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingSouth(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingWest(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanMoveRight_whileFacingNorth(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingEast(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingNorth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingWest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingSouth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveWhileFacingEast(){
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.penUp();
        ijapa.move(3, sketchPad);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
    }
    @Test
    public  void turtleCanMoveForwardWhileFacingSouth(){
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.penUp();
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(2,0), ijapa.getCurrentPosition());

    }
    @Test
    public  void turtleCanMoveForwardToWest(){
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.penUp();
        ijapa.move(3, sketchPad);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.penUp();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(2,2), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.move(3, sketchPad);
        assertEquals(WEST, ijapa.getCurrentDirection());
        assertEquals(new Position(2,0), ijapa.getCurrentPosition());
    }
    @Test
    public  void turtleCanMoveForwardToNorth(){
        ijapa.penUp();
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(2,2), ijapa.getCurrentPosition());

        ijapa.turnRight();
        ijapa.move(3, sketchPad);
        assertEquals(WEST, ijapa.getCurrentDirection());
        assertEquals(new Position(2,0), ijapa.getCurrentPosition());

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.move(2, sketchPad);
        assertEquals(new Position(1,0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());

    }
    @Test
    public void turtleCanWritePenIsDownTestFacingEast(){
        ijapa.penDown();
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        assertFalse(ijapa.isPenUp());

        ijapa.move(3, sketchPad);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
        int [][]floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);
        sketchPad.displayFloor();

    }
    @Test
    public void turtleCanWritePenIsDownTestFacingSouth(){
        ijapa.penDown();
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        assertFalse(ijapa.isPenUp());

        ijapa.move(3, sketchPad);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
        int [][]floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(2,2), ijapa.getCurrentPosition());
        sketchPad.getFloor();
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, floor[3][2]);
        sketchPad.displayFloor();

    }
    @Test
    public void turtleCanWritePenIsDownTestFacingWest(){
        ijapa.penDown();
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        assertFalse(ijapa.isPenUp());

        ijapa.move(3, sketchPad);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
        int [][]floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(2,2), ijapa.getCurrentPosition());
        sketchPad.getFloor();
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, floor[3][2]);

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(2,0), ijapa.getCurrentPosition());
        sketchPad.getFloor();
        assertEquals(1, floor[2][2]);
        assertEquals(1, floor[2][1]);
        assertEquals(1, floor[2][0]);
        sketchPad.displayFloor();
    }
    @Test
    public  void turtleCanWritePenIsDownTestFacingNorth() {
        ijapa.penDown();
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        assertFalse(ijapa.isPenUp());

        ijapa.move(3, sketchPad);
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(2, 2), ijapa.getCurrentPosition());
        sketchPad.getFloor();
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, floor[3][2]);

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(2, 0), ijapa.getCurrentPosition());
        sketchPad.getFloor();
        assertEquals(1, floor[2][2]);
        assertEquals(1, floor[2][1]);
        assertEquals(1, floor[2][0]);

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.move(3, sketchPad);
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        sketchPad.getFloor();
        assertEquals(1, floor[2][0]);
        assertEquals(1, floor[1][0]);
        assertEquals(1, floor[0][0]);
        sketchPad.displayFloor();

    }
}
