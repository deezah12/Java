package chapter7;

public class MainCheck {

    public static void main(String[] args) {
        String[] array1 = {"good", "better", "best"};
        String[] array2 =  {"good", "better", "best"};
        boolean equal = equals(array1, array2);
        System.out.println(equal);
    }

    public static boolean equals (String [] array1, String [] array2) {
        // boolean result = false;

        int count = 0;
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                    if (array1[i].equals(array2[i])) {
                        count++;
                    } else return false;

            }

        }
        if (count == array1.length){
        return true;
        }
        else return false;
    }

    }


