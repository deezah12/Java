package diary;

import java.time.LocalDateTime;

public class Entry {
    private int entryId;
    private String title;
    private String body;
    private LocalDateTime createdAt;
    public Entry(){}


    public Entry(int entryId, String title, String body) {
        this.entryId = entryId;
        this.title = title;
        this.body = body;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
