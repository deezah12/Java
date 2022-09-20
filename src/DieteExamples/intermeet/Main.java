package DieteExamples.intermeet;

public class Main {
    public static void main(String[] args) {

        Wrestlers wrestlers1 = new Deezah();
        Wrestlers wrestlers2 = new Segun();

        System.out.println("Deezah");
        wrestlers1.finisher();
        wrestlers1.themeMusic();
        wrestlers1.paymentForWork(10);

        System.out.println("Segun");
        wrestlers2.finisher();
        wrestlers2.themeMusic();
        wrestlers2.paymentForWork(8);
    }
}
