package stadium_manager.Service;

import stadium_manager.Dao.UserDAO;

import java.security.NoSuchAlgorithmException;

public class RegisterAccountService {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        UserDAO.registerAccount("admin", "password");
    }
}
