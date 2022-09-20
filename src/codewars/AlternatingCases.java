package codewars;

public class AlternatingCases {
    public static String toAlternativeString(String string){
        String result = "";
        for (char s: string.toCharArray()) {
                if(Character.isUpperCase(s)){
                    result = String.valueOf(Character.isLowerCase(s));
                }
                else {result = String.valueOf(Character.isUpperCase(s));
                }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "HELLO world";
        System.out.println(toAlternativeString(str));
    }
}
