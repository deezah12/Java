package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    List list;
    @BeforeEach
    void setUp(){
        list = new ArrayList<>();
    }

    @Test
    void thatNewListIsEmptyTest(){
        assertTrue(list.isEmpty());
    }

    @Test
    void itemListIsNotEmpty(){
        list.add("Hennessy");
        assertFalse(list.isEmpty());
    }

    @Test
    void listIsNotEmpty_SizeIsOne(){
        list.add("Hennessy");
        System.out.println(list.size());
        list.add("HADISSAH");
       // assertFalse(list.isEmpty());
        assertEquals(2,list.size());
        System.out.println(list.size());
    }

    @Test
    void addItemGetItemByIndex(){
        list.add("Hennessy");
        assertFalse(list.isEmpty());
        System.out.println( " tell me size: " + list.size());
        System.out.println("At index of: " + list.get(1));
//        assertEquals(list.get(0), "Hennessy");
        assertEquals(1,list.size());
        System.out.println(list.size());
        String saveItem = list.get(0);
        assertEquals("Hennessy", saveItem);
    }

    @Test
    void addXandYGetXandY(){
        list.add("hennessy");
        list.add("vodka");
        list.add("water");
        assertEquals("hennessy", list.get(0));
//        assertEquals("vodka",list.get(1));
//        assertEquals("water",list.get(2));

    }
}
