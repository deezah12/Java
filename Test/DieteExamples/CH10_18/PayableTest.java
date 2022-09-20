package DieteExamples.CH10_18;

import DieteExamples.CH10_17.SalaryCompensationModel;

class PayableTest {
    public static void main(String[] args) {
        Payable[] payables = new Payable[]{
                new Invoice("2342","chair",2,700.0),
                new Invoice("3434","belt", 5, 2000.0),
                new Employee("dee","hadi","6677",new SalaryCompensationModel(3000.0)),
        };

        System.out.println("invoices are processed polymorphically");

        for (Payable objectPayable : payables){
            System.out.printf("%n%s %n payment due: $%,.2f%n", objectPayable.toString(), objectPayable.getPaymentAmount());
        }
    }

}