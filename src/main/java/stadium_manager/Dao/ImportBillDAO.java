package stadium_manager.Dao;

import stadium_manager.Model.ImportBill;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImportBillDAO extends ConnectJDBC {
    public static List<HashMap<String, String>> detailImportByDate(String supplierId, String importDate, int userID) {
        List<HashMap<String, String>> detailList = new ArrayList<>();

        String query = "select A.stock_id, A.stock_name, B.quantity, A.stock_price, A.stock_price*B.quantity as total_price from "
                + "(select stock.id as stock_id, supplier.id as supplier_id, stock.price as stock_price, stock.name as stock_name "
                + "from stock inner join supplier on stock.userID=" + userID + " and stock.supplierId=" + supplierId + " and stock.supplierId = supplier.id ) as A,"
                + "(SELECT stockID, sum(quantity) as quantity, import_bill.date as import_date FROM stadium_manager.import_bill where import_bill.date='" + importDate + "'group by stockID) as B "
                + "where A.stock_id=B.stockID";

        Connection connection = ConnectJDBC.getConn();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                HashMap<String, String> supplierMap = new HashMap<>();
                supplierMap.put("stockID", resultSet.getString(1));
                supplierMap.put("stockName", resultSet.getString(2));
                supplierMap.put("quantity", resultSet.getString(3));
                supplierMap.put("price", resultSet.getString(4));
                supplierMap.put("total_price", resultSet.getString(5));

                detailList.add(supplierMap);
            }

            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ImportBillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return detailList;
    }

}
