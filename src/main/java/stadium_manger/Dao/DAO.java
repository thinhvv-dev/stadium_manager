package stadium_manger.Dao;

import java.util.Date;
import java.util.List;

public interface DAO <T> {
    T getByID(int ID);
    List<T> getAll();
    List<T> getByTime(Date start_time, Date end_time);
}
