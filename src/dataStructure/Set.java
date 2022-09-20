package dataStructure;

public class Set {
    List elements = new ArrayList();

    public void add(String element) {
        if(!elements.contains(element)) {
            elements.addList(element);
        }
    }
    public int size() {
        return elements.size();
    }
}
