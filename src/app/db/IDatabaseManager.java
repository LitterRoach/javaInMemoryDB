package app.db;

import app.models.BaseModel;

public interface  IDatabaseManager {

    public BaseModel Insert(BaseModel model);
    public <T extends BaseModel> T Get(long id, Class<T> type);
    public <T extends BaseModel> T Get(String key, String value, Class<T> type);
}
