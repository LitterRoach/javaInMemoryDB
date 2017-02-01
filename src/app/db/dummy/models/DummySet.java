package app.db.dummy.models;

import java.util.ArrayList;
import java.util.List;

public class DummySet<T> {
    private List<DummyRecord<T>> records;

    public DummySet() {
        this.records = new ArrayList<DummyRecord<T>>();
    }

    public List<DummyRecord<T>> getRecords() {
        return this.records;
    }
}
