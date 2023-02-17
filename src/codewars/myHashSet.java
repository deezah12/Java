package codewars;

import java.util.List;

public class myHashSet {
    private  static final int k = 10_000;
    private List<Integer> [] cache = new List[k];

        boolean[] arr;
        public myHashSet(){
            arr = new boolean[1_000_001];
        }
        public  void add(int key){
            arr[key]= true;
        }
        public void  remove(int key){
            arr[key]= false;
        }
        public boolean contains(int key){
            return arr[key];
        }

    public static void main(String[] args) {

    }

}
