package codewars;

import java.util.List;

public class ArrayToBinary {
    public  static  int convertBinaryToInt(List<Integer> binary){

        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}
