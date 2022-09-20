package DieteExamples.CH10_16;

public abstract class Employee implements Payable{
    private  final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double earnings();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }




    @Override
    public String toString() {
        return String.format("%s%n%s%nSocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
