package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {
@Test
    void check(){
    HeartRates heartRates = new HeartRates("hadiza", "umar", 12,12,1999);
    System.out.println(heartRates.diaplay());
}
}