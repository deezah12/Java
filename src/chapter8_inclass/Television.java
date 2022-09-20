package chapter8_inclass;

public class Television {

    private boolean isOn;
    private int channel = 3;
    private int volume = 3;
    private  boolean mute;
    private int mutedVolume;



    public boolean muteOn() {
        mutedVolume = volume;
        if (isOn && volume > 0)
            mute = true;
        volume = 0;
        return mute;
    }

    public  boolean muteOff(){
        if (isOn && !mute)
            volume = mutedVolume;
        return  mute = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turOn() {
        isOn = true;
    }

    public void turOff() {
        isOn = false;

    }

    public void increaseVolume() {
        if (isOn)
            increment();
        if (volume > 10)
            volume = 10;
    }

    public void decreaseVolume() {
        if (isOn)
            decrement();
        if (volume < 0)
            volume = 0;
    }

    private void increment() {
        volume++;
    }

    private void decrement() {
        volume--;
    }
    public int setVolume(int newVolume){
        if (isOn && newVolume >=1 && newVolume <=10)
            volume = newVolume;
        return newVolume;
    }
    public int getVolume() {
        return volume;
    }
    public int getChannel() {
        return channel;
    }

    public int setChannel(int newChannel) {
        if (isOn && newChannel >=1 && newChannel <=10)
            channel = newChannel;
        return newChannel;
    }

    public void increaseChannel(){
        if (isOn) incrementChannel();
        if (channel > 20) channel = 20;
    }

    public void decreaseChannel(){
        if (isOn)
            decrementChannel();
        if (channel < 1)
                   channel = 1;
    }
    private void incrementChannel() {
        channel++;
    }

    private void decrementChannel() {
        channel--;
    }


}
