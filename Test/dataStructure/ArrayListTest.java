package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    List list;
    @BeforeEach
    void setUp(){
        list = new ArrayList();
    }
    @Test
    public void newListIsEmptyTest(){
        list = new ArrayList();
        assertTrue(list.isEmpty());
    }
    @Test
    public void addItemListIsEmptyTest(){
        list = new ArrayList();
        list.addList("G-String");
        assertFalse(list.isEmpty());
    }
    @Test
    public void addItemIsNotEmpty_SizeIsOneTest(){
        list = new ArrayList();
        list.addList("G-String");
        assertFalse(list.isEmpty());
        assertEquals(1,list.size());
    }

    @Test
    public void addItemGetByIndexTest(){
        list.addList("A-String");
        String savedItem = list.get(0);
        assertEquals("A-String", savedItem);

    }
    @Test
    public void addXYGetXY(){
        list.addList("A-String");
        list.addList("G-String");
        assertEquals("A-String",list.get(0));
        assertEquals("G-String",list.get(1));
    }
    @Test
    public void addXYRemoveYSizeIsOneTest(){
        list.addList("A string");
        list.addList("G string");
        list.remove(1);
        assertEquals(1,list.size());

    }

    @Test
    public void addXYRemoveYFindByIndexIsNullTest(){
        list.addList("A string");
        list.addList("G string");
        list.remove(1);
        assertEquals(1,list.size());
        String deleteItem = list.get(1);
        assertNull(deleteItem);
    }

    @Test
    public void addXContainsXReturnsTrueTest(){
        list.addList("A string");
        list.addList("G string");
        assertTrue(list.contains("G string"));
    }
    @Test
    public void testThatWeCanAddItemsAndEmptyArray(){
        list.addList("A-String");
        list.addList("G-String");
        assertEquals("A-String",list.get(0));
        list.clear();
        assertFalse(list.contains("G String"));
        assertTrue(list.isEmpty());
    }


}
