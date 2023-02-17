package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolTest {

    @Test
    void check(){
        Petrol oando = new Petrol("yaba","kerosene",
                10, 100, 10);

        assertEquals(990.0, oando.getPurchaseAmount());
    }

}