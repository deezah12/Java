package DieteExamples.abstrct;
// if you have unique and general methods your subclasses will inherit
// you should use an abstract class


public abstract class Wrestler {
    public void paymentForWork(int hours){
        System.out.println("The wrestler will make $" + hours * 250.00 + "for tonight's match");
    }
    public  abstract void themeMusic();

    public abstract void finisher();

}
