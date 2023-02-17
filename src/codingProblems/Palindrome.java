package codingProblems;

public class Palindrome {

    public  static  boolean word(String words){
        return words.equals(new StringBuilder(words).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(word("madame"));
    }
}
