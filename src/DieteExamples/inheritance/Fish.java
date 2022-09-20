package DieteExamples.inheritance;

public class Fish  extends  Animal {


    private int eyes;
    private int fins;
    private int scales;


    public Fish(String name, int size, int weight, int height, int eyes, int fins, int scales) {
        super(name, size, weight, height);
        this.eyes = eyes;
        this.fins = fins;
        this.scales = scales;
    }

    @Override
    public void eat() {
        System.out.println("i swallow my meals");
        super.eat();
    }

    @Override
    public String toString() {
        return "Fish has" +
                " eyes " + eyes +
                ", fins " + fins +
                ", scales " + scales ;
    }
    public  void swim(){
        System.out.println("i swim for a living");
    }
}


