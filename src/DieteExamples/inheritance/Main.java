package DieteExamples.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5,4,10);
        System.out.println(animal);
        Goat goat = new Goat("goat", 2,6,4, 2,4,1 );
//        goat.eat();
//        goat.walk();
       // goat.run();
        Fish fish = new Fish("fish", 2,3,5,2,2,40);
        //fish.swim();
//        fish.eat();
//        System.out.println(fish);
        Bird bird = new Bird("bird", 3, 4,5, 2, 1,4);
        bird.eat();
    }
}
