package designPatternDecorator.StarBuzz;

public class HouseBlend extends Beverage{


    public HouseBlend() {
        description = "House of blend coffee";
    }


    @Override
    public double cost() {
        return 0.89;
    }
}
