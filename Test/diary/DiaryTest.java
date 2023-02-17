package diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @Test
    void unLockDiary() {
        Diary diary = new Diary("deezah", "hadiza");
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unLockDiary("hadiza");
        assertFalse(diary.isLocked());
    }

    @Test
    void lockDiary() {
        Diary diary = new Diary("deezah", "hadiza");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }


    @Test
    void createEntry() {
        Diary diary = new Diary("deezah", "hadiza");
        assertEquals(0, diary.getEntries().size());
        diary.createEntry("life", "i hate java so much");
//        var entry = diary.findEntryById(1);
//        assertEquals("i hate java so much", entry.getBody());
        assertEquals(1, diary.getEntries().size());


    }

    @Test
    void deleteEntry() {
        Diary diary = new Diary("deezah", "hadiza");
        diary.createEntry("life", "i hate java so much");
        var entry = diary.findEntryById(1);
        diary.deleteEntry(entry.getEntryId());
    }

    @Test
    void findEntryById() {
        Diary diary = new Diary("deezah", "hadiza");
        diary.createEntry("life", "i hate java so much");
        var entry = diary.findEntryById(1);
        assertEquals("i hate java so much", entry.getBody());
    }

    @Test
    void updateEntry() {
        Diary diary = new Diary("deezah", "hadiza");
        diary.createEntry("life", "i hate java so much");
        var entryBeforeUpdate =diary.findEntryById(1);
        assertEquals("life", entryBeforeUpdate.getTitle());
        diary.updateEntry(1,"mine", "i hate java so much");
        var entryAfterUpdate =diary.findEntryById(1);
        assertEquals("mine", entryBeforeUpdate.getTitle());
        assertEquals(1, diary.getEntries().size());

    }
}