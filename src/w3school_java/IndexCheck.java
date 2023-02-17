package w3school_java;

public class IndexCheck {
    public static void main(String[] args) {
        System.out.println(index(new int[]{1, 2, 3, 4}, 0));
    }
    public static int index(int[] myArray , int num){
        if (myArray == null ){
            return -1;
        }
        for (int i:myArray) {
            if (myArray[i] == num){
                return i;
            }else throw new RuntimeException("number not found");
        }
        return -1;
    }
}
