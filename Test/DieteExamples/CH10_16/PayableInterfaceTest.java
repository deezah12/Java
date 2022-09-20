package DieteExamples.CH10_16;

class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[7];



        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("Segun", "Lekan", "111-11-1111", 800.00);
        payableObjects[3] = new PieceWorker("Hadiza", "Umar", "888-88-8888", 8.7, 69);
        payableObjects[4] = new HourlyEmployee("Wummi", "Grace", "555-55-5555",  10.9, 5.6);
        payableObjects[5] = new CommissionEmployee("Francis", "Obi", "444-44-4444",  40.9, 0.7);
        payableObjects[6] = new BasePlusCommissionEmployee("Damilare", "Jolayemi", "999-99-9999",  40.9, 0.5,2);


        System.out.println("Invoices and Employees processed polymorphically:");

         for (Payable currentPayable : payableObjects) {
            if(currentPayable instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%.2f%n", employee.getBaseSalary());
            }
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }
    }

}