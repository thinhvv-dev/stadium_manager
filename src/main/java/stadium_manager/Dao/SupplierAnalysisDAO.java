package stadium_manager.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SupplierAnalysisDAO extends ConnectJDBC {
    public static List<HashMap<String, String>> supplierByTime(String startTime, String endTime, int userID) {
        List<HashMap<String, String>> supplierList = new ArrayList<>();

        String query = "select A.supplier_id, A.supplier_code, A.supplier_name, B.sum_quantity as total_quantity, sum(A.price*B.sum_quantity) as total_price from "
                + "(select stock.id as stock_id, supplier.id as supplier_id,price, supplier.name as supplier_name, supplier.code as supplier_code from stock "
                + "inner join supplier on stock.userId=" + userID
                + " and stock.supplierId = supplier.id) as A,"
                + "(SELECT stockID, sum(quantity) as sum_quantity FROM stadium_manager.import_bill  where 1=1 ";

        if (startTime != null && !startTime.equals("")) {
            query += "and import_bill.date >= '" + startTime +"'";
        }
        if (endTime != null && !endTime.equals("")) {
            query += "and import_bill.date <= '" + endTime + "'";
        }
        query += " group by stockID) as B where A.stock_id=B.stockID group by supplier_id";

        Connection connection = ConnectJDBC.getConn();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                HashMap<String, String> supplierMap = new HashMap<>();
                supplierMap.put("id", resultSet.getString(1));
                supplierMap.put("code", resultSet.getString(2));
                supplierMap.put("name", resultSet.getString(3));
                supplierMap.put("total_quantity", resultSet.getString(4));
                supplierMap.put("total_price", resultSet.getString(5));

                supplierList.add(supplierMap);
            }

            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierAnalysisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return supplierList;
    }

    public static List<HashMap<String, String>> importByTime(String startTime, String endTime, String supplierId, int userID) {
        List<HashMap<String, String>> importList = new ArrayList<>();

        String query = "select A.supplier_id, B.import_date as import_date, A.supplier_name, B.sum_quantity as total_quantity, sum(A.stock_price*B.sum_quantity) as total_price "
                + "from (select stock.id as stock_id, supplier.id as supplier_id, stock.price as stock_price, supplier.name as supplier_name, supplier.code as supplier_code "
                + "from stock inner join supplier on stock.userID=" + userID + " and stock.supplierId=" + supplierId + " and stock.supplierId = supplier.id ) as A,"
                + "(SELECT stockID, sum(quantity) as sum_quantity, import_bill.date as import_date "
                + "FROM import_bill  where 1=1 ";

        if (startTime != null) {
            query += "and import_bill.date >= '" + startTime + "' ";
        }
        if (endTime != null) {
            query += "and import_bill.date <= '" + endTime + "' ";
        }
        query += "group by import_bill.date) as B where A.stock_id=B.stockID group by import_date order by import_date ASC";

        Connection connection = ConnectJDBC.getConn();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                HashMap<String, String> supplierMap = new HashMap<>();
                supplierMap.put("supplierId", resultSet.getString(1));
                supplierMap.put("import_date", resultSet.getString(2));
                supplierMap.put("name", resultSet.getString(3));
                supplierMap.put("total_quantity", resultSet.getString(4));
                supplierMap.put("total_price", resultSet.getString(5));

                importList.add(supplierMap);
            }

            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierAnalysisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return importList;
    }
}
