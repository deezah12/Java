package codingProblems;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveGivenCharacter {

    public  static String check(String str, char ch){
        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }
    public static String wrd(String str, char ch){
        return str.chars().filter(c -> c != ch).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(check("replaceee", 'e'));
        System.out.println(wrd("replaceee", 'e'));
    }
}
