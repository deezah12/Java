package list;

public class ArrayList<S> implements  List{

    private  boolean isEmpty = true;
    public  int count;
    private  String [] elements = new String[5];
    @Override
    public void add(String item) {
        isEmpty = false;
        elements[count] = item;
        count++;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String item) {

    }

    @Override
    public void add(int id, String item) {

    }

    @Override
    public void clear() {

    }

    @Override
    public String get(int id) {
        return elements[id];
    }

    @Override
    public int size(int id) {
        return 0;
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
        return true;
    }
}
