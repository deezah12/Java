package chapter3;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double yearlySalary;
    private double increment;


    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) ;
        this.monthlySalary = monthlySalary;
    }


    public double getYearlySalary() {
        return (getMonthlySalary() * 12);
    }

//    public void setYearlySalary() {
////        yearlySalary =  monthlySalary * 12;
////        this.yearlySalary = yearlySalary;
//
//    }


    public double getIncrement() {
        return increment = (getYearlySalary() * 0.1) + getYearlySalary();
    }

}

