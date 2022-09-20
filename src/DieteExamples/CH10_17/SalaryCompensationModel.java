package DieteExamples.CH10_17;

public class SalaryCompensationModel implements  CompensationModel{

    private double weeklySalary;

    public SalaryCompensationModel(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0)
            throw  new IllegalArgumentException();
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }
}
