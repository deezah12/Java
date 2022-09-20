package DieteExamples.CH10_17;

public class BasePlusCommissionCompensationModel implements CompensationModel{

    private  double grossSales;
    private double baseSalary;
    private double commissionRate;

    public BasePlusCommissionCompensationModel(double grossSales, double baseSalary, double commissionRate) {
        this.grossSales = grossSales;
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + getGrossSales() * getCommissionRate();
    }
}
