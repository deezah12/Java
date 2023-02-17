package codingProblems;

public class CheckWhiteSpaces {
    public static boolean check(String str){
        return str.isBlank();
    }

    public  static  String checks(String str){
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        System.out.println(check("  rrr    "));
        System.out.println(checks("   rrr   "));
    }
}
