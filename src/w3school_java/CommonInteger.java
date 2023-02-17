package w3school_java;

public class CommonInteger {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {6,7,4,5,3,2};

        for (int i = 0; i <num1.length ; i++) {
            for (int j = 0; j < num2.length ; j++) {
                if (num1[i] == num2[j]){
                    System.out.println("duplicated values: " + num1[i]);
                }
            }
        }
    }
}
