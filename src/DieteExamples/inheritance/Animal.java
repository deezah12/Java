package DieteExamples.inheritance;

public class Animal {
    private String name;
    private int size;
    private int weight;
    private int height;


    public Animal(String name, int size, int weight, int height) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public  void move(int speed){
        System.out.println("Animal can move at speed" + speed);

    }
    public  void eat(){
        System.out.println("I am eating");

    }

    public  void run(){
        System.out.println("im running");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}

