package DieteExamples.employ;

public class HourlyEmployee extends  Employee{

    private double hours;
    private double wage;


    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        int totalNumberOfHourInAWeek = 168;
        if (hours <= 0.0 || hours >= 168)
            throw new IllegalArgumentException("hours worked must be >0.0 and < 168");
        this.hours = hours;
    }

    public double getHourlyWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw  new IllegalArgumentException("Hourly wage must be >= 0.0");
        this.wage = wage;
    }

    public double earnings(){
       return wage * hours;
    }

   @Override
    public  String toString(){
        return  String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s", super.toString(),"hours worked: ",
                hours, "Your hourly wage is ", wage, "Your total earning for the week is ",earnings());
   }


}
