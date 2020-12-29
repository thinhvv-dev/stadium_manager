package stadium_manger.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectJDBC {
    static Connection conn = null;

    public static Connection getConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stadium_manager?useSSL=false", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }
}
