import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import stadium_manager.Dao.UserDAO;
import stadium_manager.Model.User;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class TestUser {

    @Test
    public void testCreateUserRight() throws NoSuchAlgorithmException {
        User user = UserDAO.registerAccount("thinh", "password");
        Assert.assertEquals(user.getUserName(), "thinh");
    }

    @Test
    public void testCreateUserExist() throws NoSuchAlgorithmException {
        User user = UserDAO.registerAccount("admin", "password");
        Assert.assertNull(user.getUserName());
    }

    @Test
    public void testCreateUserInvalidValue() throws NoSuchAlgorithmException {
        User user = UserDAO.registerAccount("", "");
        Assert.assertNull(user.getUserName());
    }

    @Test
    public void testAuthenticateUserExist() throws NoSuchAlgorithmException {
        User user = UserDAO.authenticate("admin", "password");
        Assert.assertEquals(user.getUserName(), "admin");
        Assert.assertEquals(user.getPassword(), "password");
    }

    @Test
    public void testAuthenticateUserExistWithWrongPass() throws NoSuchAlgorithmException {
        User user = UserDAO.authenticate("admin", "password1");
        Assert.assertNull(user.getUserName());
        Assert.assertNull(user.getPassword());
    }

    @Test
    public void testAuthenticateUserNotExist() throws NoSuchAlgorithmException {
        User user = UserDAO.authenticate("admin1", "password");
        Assert.assertNull(user.getUserName());
        Assert.assertNull(user.getPassword());
    }

    @After
    public void rollBackDB() {
        try {
            UserDAO.getConn().rollback();
        } catch (SQLException ex) {
            System.out.println();
        }
    }

}
