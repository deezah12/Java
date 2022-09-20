package DieteExamples.inheritance;

public class Goat extends Animal {

    private  int eyes;
    private int legs;
    private int tail;


    public Goat(String name, int size, int weight, int height,int eyes, int legs, int tail) {
        super(name, size, weight, height);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;

    }

    @Override
    public void eat() {
        System.out.println("goat can eat too");
        eat();
    }

    private void chew(){
        System.out.println("im chewing grass");

    }

    public  void walk(){
        System.out.println("i am walking");
        move(5);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("very fast");
    }


}
