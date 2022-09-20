package DieteExamples.CH10_17;

class CompensationModelTest {

    public static void main(String[] args) {

        Employee employee = new Employee("hadiza", "umar", "343546", new SalaryCompensationModel(2000));
        Employee employee1 = new Employee("Segun", "Kayode", "3445666",new HourlyCompensationModel(300, 40));
        Employee employee2 = new Employee("tope", "Afolabi", "45576868",new BasePlusCommissionCompensationModel(3000, 500, 1.0));
        Employee employee3 = new Employee("saad", "lekan", "5465657", new CommissionCompensationModel(2000,0.8));


        //employee = new Employee("hadiza", "umar", "343546", new HourlyCompensationModel(300, 40));




        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee.setCompensationModel(new BasePlusCommissionCompensationModel(4000,89,0.5));
        System.out.println(employee);
    }

}