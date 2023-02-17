package w3school_java;

public class DuplicateIntegers {
    public static void main(String[] args) {
        int[] x = {22,3,11,3,4,4,5,6,5,11};


        for (int i = 0; i <x.length-1 ; i++) {
            for (int j = i + 1; j <x.length ; j++) {
//                if((x[i] == x[j]) && (i != j)){
//                    System.out.println("duplicated elements: "+ x[j]);
//                }
                if((x[i] == x[j]) && (i != j)){
                    System.out.println("duplicated elements: "+ x[j]);
                }
            }
        }
    }
}
