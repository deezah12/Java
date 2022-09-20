package bike;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear ;
    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
         isOn = true;
         gear = 1;
    }
    public void turnOff() {
        isOn = false;
        speed = 0;
        gear = 0;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        if (isOn) accelerate();
    }

    private void accelerate() {
        if (gear == 3) increaseSpeedGearThree();
        if (gear == 2) increaseSpeedGearTwo();
        if(gear == 1) increaseSpeedOnGearOne();
    }

    private void increaseSpeedOnGearOne() {
        speed++;
        if (speed > 20) gear++;
    }
    private void increaseSpeedGearTwo(){
        speed = speed + 2;
        if (speed >= 31) gear++;
    }

    private void increaseSpeedGearThree(){
        speed = speed + 3;
        if (speed >= 41) gear++;
    }
    private void increaseSpeedGearFour(){
        speed = speed + 4;
        if (speed >= 41) gear++;
    }

    public void decreaseSpeed() {
        if (isOn) decelerate();
    }
    private void decelerate() {
        if(gear == 1) decreaseSpeedOnGearOne();
        if (gear == 2) decreaseSpeedGearTwo();
        if (gear == 3) decreaseSpeedGearThree();
        if (gear == 4) decreaseSpeedGearFour();
    }
    private void decreaseSpeedOnGearOne() {
        speed--;
        if (speed < 0) speed = 0;
    }
    private void decreaseSpeedGearTwo(){
        speed = speed - 2;
        if (speed < 20) gear--;
    }

    private void decreaseSpeedGearThree(){
        speed = speed - 3;
        if (speed < 31) gear--;
    }

    private void decreaseSpeedGearFour(){
        speed = speed - 4;
        if (speed < 41) gear--;
    }


}
