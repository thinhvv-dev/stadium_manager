package stadium_manager.Dao;

import java.util.Date;
import java.util.List;

public interface DAOWithListID <T> {
    List<T> getByListID(List<Integer> ids);
}
