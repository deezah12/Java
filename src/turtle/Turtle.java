package turtle;

public class Turtle {
    private Pen turtlePen;

    public Turtle(){
        turtlePen = new Pen();
    }

    public Pen getTurtlePen() {
        return turtlePen;
    }

    public void setTurtlePen(Pen turtlePen) {
        this.turtlePen = turtlePen;
    }



}
