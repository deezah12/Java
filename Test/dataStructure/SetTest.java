package dataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetTest {

    @Test
    public void addElementsSizeIsOneTest(){
        Set mySet = new Set();
        mySet.add("G String");
        assertEquals(1, mySet.size());
    }

    @Test
    public void addXTwiceElementsSizeIsOneTest(){
        Set mySet = new Set();
        mySet.add("G String");
        mySet.add("G String");
        mySet.add("G String");
        mySet.add("G String");
        mySet.add("G String");
        mySet.add("G String");
        mySet.add("G String");
        assertEquals(1, mySet.size());
    }
}