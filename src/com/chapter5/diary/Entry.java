package com.chapter5.diary;

import java.time.LocalDateTime;

public class Entry {

    private LocalDateTime dateTime;
    private String text;

    public Entry(LocalDateTime dateTime, String text){
        this.dateTime = dateTime;
        this.text = text;
    }

    public LocalDateTime getDateTime() {

        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {

        this.dateTime = dateTime;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    @Override
    public String toString() {
        //return "Entry{" +
          //      "dateTime=" + dateTime +
            //    ", text='" + text + '\'' +
              //  '}';

        return dateTime.format(Diary.dateTimeFormatter) + " " + text;
    }

}
