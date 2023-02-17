package designPatternDecorator.StarBuzz;

public abstract class  Beverage {
    public  enum Size{SMALL, MEDIUM, LARGE};
    Size size = Size.SMALL;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String description = "Unknown Description";
    public  String getDescription(){
        return  description;
    }
    public  abstract double cost();
}
