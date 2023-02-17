package w3school_java;

public class CodeWar2 {
    public static void main(String[] args) {

        array(new int[]{2, 4, 6, 8, 7});
    }

    public static int array(int[] p) {
        int count = 0;

        System.out.print("Even numbers: ");
        for (int i = 0; i < p.length; i++) {

            if (p[i] == 0) {
            } else if (p[i] % 2 == 0) {
//                System.out.print(p[i] + " ");
//                oddCount = p[i];
            }
        }
//        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < p.length; i++) {
            if (p[i] % 2 != 0) {
                System.out.print(p[i] + " ");
                count = p[i];
            }
        }


        return count;
    }
}

