package chapter8_inclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class   AirConditionerTest {

    AirConditioner sony;

    @BeforeEach
    void setUp() {
        sony = new AirConditioner();
    }

    @Test
    void sonyCanBeTurnedOn() {
        assertFalse(sony.isOn());

        sony.turnOn();
        assertTrue(sony.isOn());
    }

    @Test
    void sonyCanBeTurnedOff() {
        sony.turnOn();
        assertTrue(sony.isOn());

        sony.turnOff();
        assertFalse(sony.isOn());
    }

    @Test
    void sonyCanIncreaseTemperature() {
        sony.turnOn();
        assertEquals(16, sony.getTemperature());

        sony.increaseTemperature();
        sony.increaseTemperature();
        assertEquals(18, sony.getTemperature());
    }


    @Test
    void sonyCanDecreaseTemperature() {
        sony.turnOn();
        assertEquals(16, sony.getTemperature());


        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        assertEquals(20, sony.getTemperature());


        sony.decreaseTemperature();
        assertEquals(19, sony.getTemperature());
    }

    @Test
    void sonyCannotIncreaseMoreThanLimit30(){
        sony.turnOn();
        assertEquals(16, sony.getTemperature());


        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        sony.increaseTemperature();
        assertEquals(30, sony.getTemperature());

    }

    @Test
    void sonyCannotDecreaseMoreThanLimit16() {
        sony.turnOn();
        assertEquals(16, sony.getTemperature());

        sony.decreaseTemperature();
        assertEquals(16, sony.getTemperature());
    }

    @Test
    void sonyWillRemainSameWhenTurnoffAndTurnon(){
        sony.turnOn();
        assertEquals(16, sony.getTemperature());

        for (int i = 0; i < 5 ; i++) {
            sony.increaseTemperature();
        }

        assertEquals(21,sony.getTemperature());

        sony.turnOff();
        sony.increaseTemperature();
        assertNotEquals(22, sony.getTemperature());

        sony.turnOn();
        assertEquals(21,sony.getTemperature());
    }
}