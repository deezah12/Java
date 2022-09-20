package chapter11.exception.unchecked;


import java.util.Arrays;
import java.util.List;

public class RegistrationService {
    public void validateEmail(String email) {
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("Invalid email");

        }
    }

    private boolean isValidEmail(String email) {
        List<String> validDomains = Arrays.asList("gmail.com", "yahoo.com", "outlook.com");
        if (validDomains.contains(email.substring(email.indexOf("@") + 1))) {
            return true;
        }
        return false;
    }
}

