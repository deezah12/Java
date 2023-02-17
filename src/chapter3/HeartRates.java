package chapter3;

public class HeartRates {
    private  String firstName;
    private  String lastName;
    private int month;
    private int day;
    private  int year;

    public HeartRates(String firstName, String lastName,
                      int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int age(){
       return 2022 - year;
    }
    public int maxHeartRate(){

        return 220 - age();
    }
    public  String diaplay(){
        return  String.format("%nfirstName: %s%nSecondName: %s%nAge: %d%nMaximum heart rate per minutes: %d%n", firstName,lastName,
        age(),maxHeartRate());
    }
}
