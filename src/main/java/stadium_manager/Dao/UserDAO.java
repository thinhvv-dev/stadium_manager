package stadium_manager.Dao;

import stadium_manager.Model.User;
import stadium_manager.Service.PasswordHash;

import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO extends ConnectJDBC {
    public static User authenticate(String userName, String password) throws NoSuchAlgorithmException {
        User user = new User();
        String query = "select * from user where username='" + userName + "'";

        Connection connection = ConnectJDBC.getConn();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String pass = resultSet.getString(3);

                if (pass.equals(PasswordHash.passwordHashing(password))) {
                    user.setID(resultSet.getInt(1));
                    user.setUserName(resultSet.getString(2));
                    user.setPassword(password);
                }
            }
            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    public static User registerAccount(String username, String password) throws NoSuchAlgorithmException {
        User user = new User();
        Connection connection = ConnectJDBC.getConn();
        String query = "Insert into user(username, password) values(?, ?)";

        try {
            if (!username.isEmpty() && !password.isEmpty()) {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, PasswordHash.passwordHashing(password));
                preparedStatement.executeUpdate();

                user.setUserName(username);
                user.setPassword(PasswordHash.passwordHashing(password));

                preparedStatement.close();
            }

            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }
}
