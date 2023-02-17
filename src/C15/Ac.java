package C15;

public class Ac {
    private boolean isOn;
    private int temperature = 16;

   public boolean isOn(){
       return  isOn;

   }
    public void turnOn() {
            isOn = true;
    }

    public void turnOff(){
           isOn = false;
    }


    public void increaseTemperature() {
       if(isOn){
           temperature++;
       }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
       if (isOn){
           temperature--;
       }

    }
}
