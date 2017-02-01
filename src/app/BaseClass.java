package app;

import app.db.IDatabaseManager;
import app.db.dummy.DummyDatabaseManager;

public abstract class BaseClass {

    public IDatabaseManager databaseManager;
    public long accountId;
    public long userId;

    public BaseClass() {
        this.databaseManager = new DummyDatabaseManager();
        this.accountId = 0;
        this.userId = 0;
    }
}
