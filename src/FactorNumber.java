public class FactorNumber {

    public int factorX(int number){
        int addNumber = 0;
        for (int i = 1; i <= number; i++) {
       if(number % i == 0){
           addNumber++;
       }
       }
        return addNumber;
    }

    public static void main(String[] args) {
        FactorNumber fact = new FactorNumber();
        int check = fact.factorX(5);
        //System.out.println(fact.factorX(6));
        System.out.println(check + " is the number of factors it has." );

    }
}
