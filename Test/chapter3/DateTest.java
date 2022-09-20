package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    Date date;

    @BeforeEach
    void setUp() {
        date = new Date(7, 28, 2022);
    }

    @Test
    void testThatDateExist() {
        assertNotNull(date);
    }


    @Test
    void displayDate() {

        assertEquals("28/7/2022", date.getDisplayDate());

    }
}

