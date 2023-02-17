package codewars;

public class Dna {
    public  static String makeComplete(String dna){
        return dna.replaceAll("[A]", "T").replaceAll("[G]", "C");
    }

    public static void main(String[] args) {
        System.out.println(makeComplete("TAG"));
    }
}
