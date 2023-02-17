package designPatternDecorator.StarBuzz;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark roast coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
