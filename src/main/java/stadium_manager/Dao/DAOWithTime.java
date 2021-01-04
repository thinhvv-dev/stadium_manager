package stadium_manager.Dao;

import java.util.Date;
import java.util.List;

public interface DAOWithTime <T> {
    List<T> getByTime(Date start_time, Date end_time, int userID);
}
