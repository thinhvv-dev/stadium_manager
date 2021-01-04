package stadium_manager.Dao;

import java.util.Date;
import java.util.List;

public interface DAO <T> {
    T getByID(int ID);
    List<T> getAll(int userID);
}
