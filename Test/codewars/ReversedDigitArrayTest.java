package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedDigitArrayTest {
    @Test
    public void tests(){
        assertArrayEquals(new  int[] {1,2,3,4,5}, ReversedDigitArray.digitize(54321) );
        assertArrayEquals(new int[] {3,5,6,7}, ReversedDigitArray.digitize(7653));
        assertArrayEquals(new int[] {0}, ReversedDigitArray.digitize(0));
    }

}