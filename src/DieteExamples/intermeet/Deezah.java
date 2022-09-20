package DieteExamples.intermeet;

public class Deezah implements Wrestlers{
    @Override
    public void themeMusic() {
        System.out.println("shaku shaku");

    }

    @Override
    public void finisher() {
        System.out.println("under taker");

    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("Deezah will make $" + hours * 750.00 + "for tonight's match");

    }
}
