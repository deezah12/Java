package designPatternDecorator.StarBuzz;

public abstract  class Condiment extends Beverage{
    Beverage beverage;
    public  abstract String getDescription();
    public Size getSize() {
        return beverage.getSize();
    }
}
