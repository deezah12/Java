package w3school_java;

public class Contains {
    public static void main(String[] args) {
        System.out.println(contain(new int[]{12, 3, 4, 5, 6}, 3));
    }

    public static int contain(int[] arr, int item) {
        if (arr == null) {
            return -1;
        }
        for (int i : arr) {
            if (item == i) {
                return i;
            }
        }
        return -1;
    }
}
