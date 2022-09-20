package com.chapter5.diary;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Database {
    ArrayList<Entry> entries;


    public Database() {
        entries = new ArrayList<>();

    }
    public  ArrayList<Entry> findEntries(LocalDateTime dateTime, boolean byTime){
        ArrayList<Entry> found = new ArrayList<>();
        for(Entry entry : entries){
            if((byTime && (entry.getDateTime().equals(dateTime)))
                    ||
                    ((!byTime) && (entry.getDateTime().toLocalDate().equals(dateTime.toLocalDate())))){
                found.add(entry);
            }
        }
        return found;
    }

    public void deleteEntries(LocalDateTime dateTime){
        ArrayList<Entry> found = findEntries(dateTime, true);
        for (Entry entry : found){
            entries.remove(entry);
        }
    }


    public void addEntry(LocalDateTime dateTime, String text) {
        entries.add(new Entry(dateTime, text));
    }
}
