package codeLife.arraylist;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public  Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private  Node last;
    public  void addLast(int item){
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }
    public  void addFirst(int item){
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }
    public  boolean isEmpty(){
        return first == null;
    }
    public  int indexOfItem(int item){
        int index = 0;
        var current = first;
        while ( current != null){
            if (current.value == item) return index;
        }
        return index;
    }
}
