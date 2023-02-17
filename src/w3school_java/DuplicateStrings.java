package w3school_java;

public class DuplicateStrings {
    public static void main(String[] args) {
        String[] y = {"java", "python", "ctt", "css", "css", "java"};

        for (int i = 0; i < y.length - 1; i++) {
            for (int j = i + 1; j < y.length; j++) {
                if (y[i].equals(y[j]) && (i != j)){
                    System.out.println("Duplicated values are: " + y[j]);
                }
            }
        }
    }
}
