package app.db.dummy.models;

public class DummyRecord<T> {
    public DummyRecord(T model, long id) {
        this.model = model;
        this.id = id;
        this.type = model.getClass();
    }
    private T model;
    private long id;
    private Class type;
}
