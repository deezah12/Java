package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your password: ");
//
        System.out.println(isValid());
    }
    public static boolean isValid(){
       // Pattern p  = Pattern.compile("(?=.*\\d)+(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,16}");
        Pattern p  = Pattern.compile("^(?=.*\\d)+(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])+.{8,16}$");
        Matcher m = p.matcher("@Deezah1");
        return m.matches();
    }
}
