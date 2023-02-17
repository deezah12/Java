package C15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {
    @Test
    public void checkAcIsOn() {
        Ac lg = new Ac();
        lg.turnOn();
        assertTrue(lg.isOn());
    }

    @Test
    public void checkAcIsOff() {
        Ac lg = new Ac();
        lg.turnOff();
        assertFalse(lg.isOn());
    }

    @Test
    public void checkThatTemperatureCanIncrease() {
        Ac lg = new Ac();
        assertFalse(lg.isOn());
        lg.turnOn();
        assertTrue(lg.isOn());
        lg.increaseTemperature();
        assertEquals(17, lg.getTemperature());
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(21, lg.getTemperature());
    }


    @Test
    public void checkThatTemperatureCanDecrease() {
        Ac lg = new Ac();
        assertFalse(lg.isOn());
        lg.turnOn();
        assertTrue(lg.isOn());
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(18, lg.getTemperature());
        lg.decreaseTemperature();
        assertEquals(17, lg.getTemperature());
    }

}