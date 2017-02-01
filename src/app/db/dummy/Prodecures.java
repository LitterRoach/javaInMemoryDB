package app.db.dummy;

import app.models.BaseModel;
import app.models.User;

import java.util.List;
import java.util.Map;

public class Prodecures {
    public static <T extends BaseModel> T GetUserByEmail(List<BaseModel> records, Map<String, String> parameters, Class<T> type) {
        for (BaseModel record : records) {
            if (((User)record).getEmail() == parameters.get("Email")) {
                return (T)record;
            }
        }
        return null;
    }
}
