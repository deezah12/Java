package designPatternDecorator.StarBuzz;

public class Decaf  extends  Beverage{


    @Override
    public double cost() {
        return 1.05;
    }


    public Decaf() {
        description = "Decaf";
    }
}
