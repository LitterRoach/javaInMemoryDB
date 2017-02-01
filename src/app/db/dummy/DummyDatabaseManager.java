package app.db.dummy;

import app.db.IDatabaseManager;
import app.models.BaseModel;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DummyDatabaseManager implements IDatabaseManager {

    private List<BaseModel> records;
    private Gson gson;

    public DummyDatabaseManager(){
        this.records = new ArrayList<BaseModel>();
        this.gson = new Gson();
    }

    public BaseModel Insert(BaseModel model) {
        model.setId(new Random().nextInt(1000000));
        records.add(model);
        return model;
    }

    public <T extends BaseModel> T Get(long id, Class<T> type) {
        return (T)records.stream().filter(o -> o.getId() == id).findFirst().get();
    }

    public <T extends BaseModel> T Get(String key, String value, Class<T> type) {
        for (BaseModel record : records) {
            String json = gson.toJson(record);
            JsonElement jsonElement = new JsonParser().parse(json);
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonElement finalKey = jsonObject.get(key.toLowerCase());
            if (finalKey != null) {
                String compare = finalKey.getAsString();
                if (compare.equals(value)) {
                    return (T) record;
                }
            }
        }
        return null;
    }
}