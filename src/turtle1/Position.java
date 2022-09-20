package turtle1;

public class Position {

    private int rows;
    private int columns;
    public Position(int rows, int column) {
        this.rows = rows;
        this.columns = column;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    @Override
    public boolean equals(Object obj){
        if (!obj.getClass().equals(this.getClass())) return  false;
        Position comparedPosition = (Position) obj;
        boolean rowsAreEquals = comparedPosition.rows == this.rows;
        boolean columnsAreEquals = comparedPosition.columns == this.columns;
        return rowsAreEquals && columnsAreEquals;
    }

    @Override
    public String toString() {
        return "Position{" +
                "rows=" + rows +
                ", columns=" + columns +
                '}';
    }
}
