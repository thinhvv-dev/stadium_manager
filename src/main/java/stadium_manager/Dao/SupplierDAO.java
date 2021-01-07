package stadium_manager.Dao;

import stadium_manager.Model.Supplier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SupplierDAO extends ConnectJDBC implements DAO<Supplier> {
    @Override
    public Supplier getByID(int ID) {
        Supplier supplier = new Supplier();

        String query = "select * from supplier where id=" + ID;

        Connection connection = ConnectJDBC.getConn();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                supplier.setID(resultSet.getInt(1));
                supplier.setName(resultSet.getString(2));
                supplier.setCode(resultSet.getString(3));
                supplier.setUserID(resultSet.getInt(4));
            }

            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return supplier;
    }

    @Override
    public List<Supplier> getAll(int userID) {
        List<Supplier> supplierList = new ArrayList<>();

        String query = "select * from supplier where userID=" + userID;

        Connection connection = ConnectJDBC.getConn();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                supplierList.add(new Supplier(
                                resultSet.getInt(1),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getInt(4)
                        )
                );
            }

            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return supplierList;
    }
}
