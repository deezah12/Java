package bike2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bike1Test {

    Bike1 bike1;

    @BeforeEach
    void setUp() {
        bike1 = new Bike1();
    }

    @Test
    void checkThatBikeCanTurnOn() {
        assertFalse(bike1.isOn());

        bike1.turnOn();
        assertTrue(bike1.isOn());
    }

    @Test
    void checkThatBikeCanTurnOff() {
        assertFalse(bike1.isOn());

        bike1.turnOn();
        assertTrue(bike1.isOn());

        bike1.turnOff();
        assertFalse(bike1.isOn());
    }

    @Test
    void checkBikeCanAccelerateGearOneTest() {
        bike1.turnOn();
        assertEquals(0, bike1.getSpeed());
        assertEquals(1, bike1.getGear());

        bike1.increaseSpeed();
        bike1.increaseSpeed();
        bike1.increaseSpeed();
        assertEquals(1, bike1.getGear());
        assertEquals(3, bike1.getSpeed());
    }

    @Test
    public void bikeWillAccelerateWhenBikeIsOffTest() {
        assertFalse(bike1.isOn());
        assertEquals(0, bike1.getSpeed());

        bike1.increaseSpeed();
        assertEquals(0, bike1.getSpeed());

    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically() {
        bike1.turnOn();
        for (int i = 0; i < 20; i++) {
            assertEquals(1, bike1.getGear());
        }
        bike1.increaseSpeed();
        assertEquals(2, bike1.getGear());
    }

    @Test
    public void bikeCanChangeFromGearTwoToGearThree() {
        bike1.turnOn();
        for (int i = 0; i < 30; i++) {
            assertEquals(2, bike1.getGear());

        }
    }

}