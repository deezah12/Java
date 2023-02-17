package designPatternDecorator.StarBuzz;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        System.out.println("An Expresso order without condiments");
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription()+ " $" +beverage.cost()+"\n");


        System.out.println("Dark roast order with condiments");
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+ " $" +beverage1.cost()+"\n");

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $" +beverage2.cost()+"\n");


        Beverage beverage3 = new Decaf();
        beverage3.setSize(Beverage.Size.LARGE);
        beverage3 = new Milk(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() +" $"+ beverage3.cost() + beverage3.getSize());
    }
}
