package DieteExamples.employ;

public class CommissionEmployee  extends  Employee{

    private  double grossSales;
    private  double commissionRate;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }



    public void setGrossSales(double grossSales) {

        if (grossSales < 0.0)
            throw  new IllegalArgumentException("gross sale must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("commission rate must be >0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings(){
        return commissionRate * grossSales;
    }

    @Override
    public  String toString(){
//        return  String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f" ,
//                "", firstName, lastName, "social security number", socialSecurityNumber,
//                "gross sales", grossSales, "commision rate", commissionRate);
        return String.format("%s%n%s: %.2f%n%s: %.2f", super.toString(), "commission rate" ,
                getCommissionRate(), "gross sales" ,getGrossSales());
    }
}


