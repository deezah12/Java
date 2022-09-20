package DieteExamples;

class CommissionEmployeeTest {
    public static void main(String[] args) {

        CommissionEmployee employee = new CommissionEmployee("hadiza", "umar", "223556235", 10_000.0, .06);

        System.out.println("Employee information gotten are");
        System.out.println("First name is: " + employee.getFirstName());
        System.out.println("Second name is: " + employee.getLastName());
        System.out.println("Social security number is: " + employee.getSocialSecurityNumber());
        System.out.println("Gross sales is: " + employee.getGrossSales());
        System.out.println("Commission rate is : " + employee.getCommissionRate());
        employee.setGrossSales(1000);
        employee.setCommissionRate(.1);
        System.out.printf("%n%s:%n%n%s%n","update employee information: ",  employee);
    }
}
