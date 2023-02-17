package codewars;

public class BinaryTo {
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static void main(String[] args) {
        System.out.println(toBinary(2));
    }
}
