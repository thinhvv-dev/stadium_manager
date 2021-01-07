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

    public static void registerAccount() throws NoSuchAlgorithmException {
        Connection connection = ConnectJDBC.getConn();
        String query = "Insert into user(username, password) values(?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "admin");
            preparedStatement.setString(2, PasswordHash.passwordHashing("admin"));
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
