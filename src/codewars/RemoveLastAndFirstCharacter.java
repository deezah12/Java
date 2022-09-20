package codewars;

public class RemoveLastAndFirstCharacter {
    public static String remove(String str){
        StringBuilder s = new StringBuilder(str);
        s.deleteCharAt(0);
        s.deleteCharAt(s.length() -1);
        return s.toString();
    }
    public static String replace(String str){
        return  str.replaceAll("^.|.$", "");
    }

    public static void main(String[] args) {
        String str = "country";
        System.out.println(replace(str));
    }
}
