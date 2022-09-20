package codeLife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortingTest {

    @Test
    public void arrayCanSort(){
        int [] array = {9,8,3,4,2,4,5};
        int [] result = {2,3,4,4,5,8,9};
        assertArrayEquals(result, ArraySorting.sortNumericArray1(array));
    }

}