package chapter8_inclass;

public class AirConditioner {

    private boolean isOn;
    private  int temperature = 16;

    public boolean isOn() {
        return  isOn;
    }

    public void turnOn() {
        isOn = true;

    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (isOn) increment();
        if (temperature >= 30) temperature = 30;
    }
    private void increment() {
        temperature++;
    }


    public void decreaseTemperature() {
        if (isOn) decrement();
        if (temperature < 16) temperature = 16;
    }
    private void decrement() {
        temperature--;


    }
}
