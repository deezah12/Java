package DieteExamples.CH10_17;

public class Employee{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private CompensationModel compensationModel;



    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel)

    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;

    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public  double earnings(){
        return  getCompensationModel().earnings();
    }


    @Override
    public  String toString(){
        return  String.format( "Name: %s %s%n%s %s: %s%f"
                , firstName, lastName, "social security number: ", socialSecurityNumber, "earnings", earnings());
    }
}


