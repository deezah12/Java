package DieteExamples.CH10_16;

class PayableRollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Sarah", "Sunday", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Kazeem", "Pius", "222-22-2222", 6.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Smith", "Henry", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        PieceWorker pieceWorker = new PieceWorker("Sarah", "Aki", "555-55-5555", 10.35, 70);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", pieceWorker, "earned", pieceWorker.earnings());

        Employee[] employees = new Employee[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;


        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%.2f%n", employee.getBaseSalary());
               // System.out.printf("earned $%.2f%n%n", currentEmployee.earnings());
            }

//            for (int i = 0; i < employees.length; i++)
//                System.out.printf("Employee %d is a %s%n", i,
//                        employees[i].getClass());
        }


    }
}