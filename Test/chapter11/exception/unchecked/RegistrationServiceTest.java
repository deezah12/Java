package chapter11.exception.unchecked;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationServiceTest {

        public static void main(String[] args) {
            RegistrationService service = new RegistrationService();
            service.validateEmail("abc@gmail1.com");
        }
    }
