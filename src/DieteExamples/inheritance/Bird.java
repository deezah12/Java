package DieteExamples.inheritance;

public class Bird  extends  Animal{
    private int wings;
    private int beak;
    private int crow;



    public Bird(String name, int size, int weight, int height,int wings, int beak, int crow) {
        super(name, size, weight, height);
        this.wings = wings;
        this.beak = beak;
        this.crow = crow;
    }

    public  void fly(){
        System.out.println("im flying");
    }

    @Override
    public void eat() {
        System.out.println("im picking grains");
//        super.eat();
        super.eat();
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wings=" + wings +
                ", beak=" + beak +
                ", crow=" + crow +
                '}';
    }
}
