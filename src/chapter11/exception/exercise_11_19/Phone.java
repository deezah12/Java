package chapter11.exception.exercise_11_19;

public class Phone {
    public static boolean validate(String name, String serialNumber)
            throws ValidationException {
        //if (!validate (name, serialNumber)) {
           if (name == null && serialNumber == null) {
            throw new ValidationException("Name and serial number cannot be Null");
        } else {
               System.out.println("NOKIA...... Changing lives");
           }

        return false;
    }





    public static void main(String[] args) {
        {
            try {
                validate(null, null);
            } catch (ValidationException ex) {
                System.out.println("Exception occurred: " + ex);
            }
            //System.out.println("Invalid name and serial number");
        }
    }
}
