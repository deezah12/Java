package turtle1;

import static turtle1.Direction.*;

public class Turtle {
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);
    private boolean isPenUp;

    public void penUp() {
        isPenUp = true;
    }

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == EAST) face(SOUTH);
        else if(currentDirection == SOUTH) face(WEST);
        else if(currentDirection == WEST) face(NORTH);
        else if(currentDirection == NORTH) face(EAST);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if(currentDirection == EAST) face(NORTH);
        else if(currentDirection == NORTH) face(WEST);
        else if(currentDirection == WEST) face(SOUTH);
        else if(currentDirection == SOUTH) face(EAST);

    }
    public Position getCurrentPosition(){
        return currentPosition;
    }
    private void move(int noOfSteps) {
        // noOfSteps = noOfSteps - 1;
        if (currentDirection == EAST){
           int newColumn = currentPosition.getColumns() + noOfSteps;
           currentPosition.setColumns(newColumn);
        }
        if (currentDirection == SOUTH){
            int newRow = currentPosition.getRows() + noOfSteps;
            currentPosition.setRows(newRow);
        }
        if (currentDirection == WEST){
            int newColumn = currentPosition.getColumns() - noOfSteps ;
            currentPosition.setColumns(newColumn);
        }
        if (currentDirection == NORTH){
            int newRow = currentPosition.getRows() - noOfSteps;
            currentPosition.setRows(newRow);
        }
    }



    public void move(int noOfSteps, SketchPad sketchPad) {
        noOfSteps = noOfSteps - 1;
        if (!isPenUp)writeOn (sketchPad, noOfSteps);
        move(noOfSteps);
    }

    private void writeOn(SketchPad sketchPad, int noOfSteps) {
       int[][] floor = sketchPad.getFloor();
       int currentRow = currentPosition.getRows();
       int currentColumn = currentPosition.getColumns();
       if (currentDirection == EAST){
           for (int i = 0; i <= noOfSteps ; i++) {
               floor[currentRow][currentColumn++] = 1;
           }
       }
       else if (currentDirection == SOUTH){
            for (int i = 0; i <= noOfSteps ; i++) {
                floor[currentRow++][currentColumn] = 1;
            }
        }
       else if (currentDirection == WEST){
            for (int i = 0; i <= noOfSteps; i++) {
                floor[currentRow][currentColumn--] = 1;
            }
        }
       else if (currentDirection == NORTH){
            for (int i = 0; i <= noOfSteps; i++) {
                floor[currentRow--][currentColumn] = 1;
            }
        }
    }
}
