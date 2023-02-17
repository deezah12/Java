package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
    @Test
    void check(){
    Clock swatch = new Clock(22, 4,5);
    assertEquals("22:4:5", swatch.displayTime());
}
}