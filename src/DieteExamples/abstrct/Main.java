package DieteExamples.abstrct;

public class Main {
    public static void main(String[] args) {
        Wrestler wrestler1 = new Hadiza();
        Wrestler wrestler2 = new Lekan();

        wrestler1.themeMusic();
        wrestler1.finisher();
        wrestler1.paymentForWork(4);


        wrestler2.themeMusic();
        wrestler2.finisher();
        wrestler2.paymentForWork(8);


    }
}
