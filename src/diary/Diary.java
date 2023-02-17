package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private  String userName;
    private String password;
    private boolean isLocked;
    private final List<Entry> entries = new ArrayList<>();

    private  int entryId = 1;

    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void unLockDiary(String passwordI){
       if (passwordI.equals(password)){
           isLocked = false;
       }
    }

    public void lockDiary(){
        isLocked = true;

    }

    public  boolean isLocked(){

        return isLocked;
    }

    public void createEntry(String title, String body){
        Entry entry = new Entry(entryId, title, body);
        entries.add(entry);
        entryId++;
    }

    public void deleteEntry(int id){
        var foundId = findEntryById(id);
        entries.remove(foundId);

    }

    public Entry findEntryById(int id){
        for (Entry entry:entries) {
            if (entry.getEntryId() == id)return entry;
        }
        return null;

//        return entries.get(id);
    }

    public void updateEntry(int id, String title, String body){
//            var foundEntry = findEntryById(id);
//            foundEntry.setBody(body);
//            foundEntry.setTitle(title);
//            foundEntry.setBody(body);
//            entries.add(foundEntry);
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getEntryId() == id){
                Entry foundEntry = findEntryById(id);
                foundEntry.setBody(body);
                foundEntry.setTitle(title);
                foundEntry.setBody(body);
                entries.set(i, foundEntry);
                return;
            }
        }
    }

    public List<Entry> getEntries() {
        return entries;
    }
}
