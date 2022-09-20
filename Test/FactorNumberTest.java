import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorNumberTest {

    FactorNumber fact;
    @BeforeEach
    void setUp(){
       fact = new FactorNumber();
    }
    @Test
    void testForFactor(){
        fact.factorX(20);
        assertEquals(6, fact.factorX(20));
    }
}