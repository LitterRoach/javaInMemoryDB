package app.models;

public class List extends BaseModel {
    private long accountId;
    private long eventId;
    private String name;

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getAccountId() {
        return this.accountId;
    }

    public long getEventId() {
        return this.eventId;
    }

    public String getName() {
        return this.name;
    }
}
