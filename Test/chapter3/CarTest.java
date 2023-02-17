package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void check(){
        Car honda = new Car("2022", "acord",500.0);
        assertEquals(450.0, honda.getDiscount(0.10));
        Car camry = new Car("2012", "muscle", 1000);
        assertEquals(930, camry.getDiscount(0.07));
    }

}