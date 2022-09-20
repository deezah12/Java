public class Prime {

    public boolean isPrime(int number){
       boolean result = false;

        FactorNumber fact = new FactorNumber();
        if(fact.factorX(number) == 2){
            result = true;
        }
        return result;
    }
}
