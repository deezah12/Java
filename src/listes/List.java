package listes;

public interface List {

    void add(String item);
    void remove(int id);
    void remove(String item);
    void add(int id, String item);
    void clear();
    String get(int id);
    int size(int id);

    int size();

    boolean isEmpty();
    boolean contains(String anotherItem);
}
