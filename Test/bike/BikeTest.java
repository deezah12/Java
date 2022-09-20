package bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void bikeCanBeTurnedOn() {

        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeCanTurnOff() {

        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());

        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void bikeCanAccelerateOnGearOneTest() {
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(3, bike.getSpeed());


    }

    @Test
    public void bikeWillAccelerateWhenBikeIsOffTest() {
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically() {
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
    }

    @Test
    public void bikeCanAccelerate() {
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.increaseSpeed();
        }
        assertEquals(21, bike.getSpeed());
        bike.increaseSpeed();
        assertEquals(23, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(27, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void bikeCanChangeFromGearTwoToGearThree() {
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.increaseSpeed();
        }
        assertEquals(29, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.increaseSpeed();
        assertEquals(3, bike.getGear());
        assertEquals(31, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearThreeToGearFour() {
        bike.turnOn();
        for (int i = 0; i < 28; i++) {
            bike.increaseSpeed();
        }
        assertEquals(37, bike.getSpeed());
        assertEquals(3, bike.getGear());

        bike.increaseSpeed();
        bike.increaseSpeed();
        assertEquals(4, bike.getGear());
        assertEquals(43, bike.getSpeed());
    }


    @Test
    public void bikeCanDecelerateAtGearOne() {
        bike.turnOn();
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed();
        }
        assertEquals(1, bike.getGear());
        bike.decreaseSpeed();
        assertEquals(19, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeCanDecelerateAtGearTwo() {
        bike.turnOn();
        for (int i = 0; i < 25; i++) {
            bike.increaseSpeed();
        }
        assertEquals(2, bike.getGear());
        bike.decreaseSpeed();
        bike.decreaseSpeed();
        assertEquals(25, bike.getSpeed());
    }

    @Test
    public void bikeCanDecelerateAtGearThree() {
        bike.turnOn();
        for (int i = 0; i < 27; i++) {
            bike.increaseSpeed();
        }
        assertEquals(3, bike.getGear());
        bike.decreaseSpeed();
        assertEquals(31, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void bikeCanChangeFromGearThreeToGearTwo() {
        bike.turnOn();
        for (int i = 0; i < 27; i++) {
            bike.increaseSpeed();
        }
        assertEquals(34, bike.getSpeed());
        assertEquals(3, bike.getGear());

        bike.decreaseSpeed();
        assertEquals(3, bike.getGear());
        assertEquals(31, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearFourToGearThree() {
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.increaseSpeed();
        }
        assertEquals(4, bike.getGear());
        assertEquals(43, bike.getSpeed());

        bike.decreaseSpeed();
        assertEquals(3, bike.getGear());
        assertEquals(39, bike.getSpeed());
    }
}
