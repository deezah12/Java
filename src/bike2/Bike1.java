package bike2;

public class Bike1 {
    private boolean isOn;
    private int speed;
    private  int gear;


    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
         isOn = true;
         gear = 1;
    }
    public void increaseSpeed(){
        if (isOn) accelerate();
    }

    private void accelerate() {
        if (gear == 1) increaseSpeedGearOne();
        if (gear == 2) increaseSpeedGearTwo();
        if (gear == 3) increaseSpeedGearThree();
        if (gear == 4) increaseSpeedGearFour();
    }


    private void increaseSpeedGearFour() {
        speed =+ 4;
        if (speed >= 41) gear++;
    }

    private void increaseSpeedGearThree() {
        speed =+ 3;
        if(speed >= 31) gear++;
    }

    private void increaseSpeedGearTwo() {
        speed =+ 2;
        if (speed > 20) gear++;
    }

    private void increaseSpeedGearOne() {
        speed++;
        if (speed > 0) gear++;
    }


    public void turnOff() {
        isOn = false;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
