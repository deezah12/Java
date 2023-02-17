package codingProblems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemovingDuplicateCharacter {

    public  static String remove(String str){

        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(remove("11334445"));
    }
}
