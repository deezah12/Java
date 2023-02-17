package chapter3;

public class Clock {
    private  int hour;
    private  int minutes;
    private  int second;

    public Clock(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = hour;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
             this.minutes = minutes;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            this.second = second;
        }
    }
    public String displayTime(){
        return String.format("%d:%d:%d", hour,minutes,second);
    }
}
