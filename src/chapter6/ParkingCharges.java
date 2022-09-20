package chapter6;

public class ParkingCharges {
    private int hoursParked;


    public ParkingCharges(int hoursParked) {
        this.hoursParked = hoursParked;
    }


    public int getHoursParked() {
        return hoursParked;
    }

    public void setHoursParked(int hoursParked) {
        if (hoursParked < 0)
            throw new IllegalArgumentException();
        this.hoursParked = hoursParked;
    }
    public  double getFee(){
        return getFee();
    }

    public double charges(int hoursParked, double fee) {
        hoursParked = 0;
        fee = 3;
        if (hoursParked == 3) {
            getFee() ;
        }

        else if (hoursParked > 3) {
            int minutes = hoursParked - 3;
            minutes = (int) (minutes % 10);
            fee = 2 + (0.05 * minutes);
        }

        else if (hoursParked == 24) {
            fee = 10;
        }
        else {
            // exces fee thereof
            fee = 2.5;
        }
        return fee;
    }


}
