package codingProblems;

public class ReverseString {
    public  static  String reverse(String word){

        return new StringBuilder(word).reverse().toString();
    }
    public  static  String decesend(String word){

        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("deezah"));
    }
}
