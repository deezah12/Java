package codewars;

public class VowelRemover {
    public  static  String shortCut(String input){
        String word = input.replaceAll("[aeiou]", "");
        return word;
    }

}
