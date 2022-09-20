package dataStructure;

import java.util.Objects;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private final String[] elements = new String[5];
    private int count;

    @Override
    public void add(String item) {

    }

    @Override
    public void addList(String item) {
        isEmpty = false;
        elements[count] = item;
        count++;
    }

    @Override
    public void remove(int id) {
        elements[id] = null;
        count--;

    }

    @Override
    public void remove(String item) {

    }

    @Override
    public String get(int id) {

        return elements[id];
    }

    @Override
    public void add(int id, String item) {
        elements[id]  = item;
        count++;
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        isEmpty = true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean contains(String anotherItem) {
        boolean validation = false;
        for (int i = 0; i < size() ; i++) {
            if(Objects.equals(elements[i], anotherItem)){
                validation = true;
            }
        }
        return validation;
    }
}
