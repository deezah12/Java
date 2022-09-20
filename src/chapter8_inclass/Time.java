package chapter8_inclass;

public  class Time{

    private int hour;
    private int minute;
    private  int second;

    public Time(int hour, int minute, int second) {

        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private void validateSecond(int second) {
        if (second < 0 || second > 59) throw new IllegalArgumentException
                (String.format("The second %s entered is wrong, please enter hour between 0 and 59"));
    }

    private void validateMinute(int minute) {
        if (minute < 0 || minute > 59) throw new IllegalArgumentException
                (String.format("The minutes %s entered is wrong, please enter hour between 0 and 59"));
    }

    private void validateHour(int hour) {
        if (hour < 0 || hour > 23) throw new IllegalArgumentException
                (String.format("The hour %s entered is wrong, please enter hour between 0 and 23"));
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }
}
