package chapter16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MixingList {
    private static  List<Integer>list = new LinkedList<>();
    private static List<Integer> mixList(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        int count = 0;

        while (count < list1.size()){
            int numOne = list1.get(count);
            int numTwo = list2.get(count);
            list.add(numOne);
            list.add(numTwo);
            count++;
        }
        return list;
        }

    public static void main(String[] args) {
        Integer [] numOne= {3,1,7,4};
        Integer [] numTwo= {5,6,8,0};

        LinkedList<Integer>list1 = new LinkedList<>(Arrays.asList(numOne));
        LinkedList<Integer>list2 = new LinkedList<>(Arrays.asList(numTwo));
        System.out.println(MixingList.mixList(list1,list2));
    }

}
