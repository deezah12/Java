package turtle1;

public class SketchPad {
    private int noOfRows;
    private int noOfColumns;
    private int[][] floor;

    public SketchPad(int noOfRows, int noOfColumns) {
        this.noOfColumns = noOfColumns;
        this.noOfRows = noOfRows;
        floor = new int[noOfRows][noOfColumns];

    }

    public int[][] getFloor() {
        return floor;
    }

    public void displayFloor() {
        System.out.println("RESULT");
            for (int i = 0; i < noOfRows; i++) {
                for (int j = 0; j < noOfColumns; j++) {
                    if(floor[i][j] == 1)
                    System.out.print("X");
                    else System.out.print("-");
                    System.out.print(" | ");
                }
                System.out.println();
            }
        }
    }


