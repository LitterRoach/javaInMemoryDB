package app.models;


import java.util.Date;
import java.util.Random;

public abstract class BaseModel {
    private long id;
    private long createdByUserID;
    private Date createdDate;
    private long editedByUserID;
    private Date editedDate;

    public BaseModel() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }
}
