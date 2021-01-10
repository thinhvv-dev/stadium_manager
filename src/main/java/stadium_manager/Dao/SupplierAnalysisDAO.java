package stadium_manager.Dao;

import stadium_manager.Model.ImportSupplier;
import stadium_manager.Model.SupplierAnalysis;

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
    public static List<SupplierAnalysis> supplierByTime(String startTime, String endTime, int userID) {
        List<SupplierAnalysis> supplierList = new ArrayList<>();

        String query = "select A.supplier_id, A.supplier_code, A.supplier_name, B.sum_quantity as total_quantity, sum(A.price*B.sum_quantity) as total_price from "
                + "(select stock.id as stock_id, supplier.id as supplier_id,price, supplier.name as supplier_name, supplier.code as supplier_code from stock "
                + "inner join supplier on supplier.userID=" + userID
                + " and stock.supplierId = supplier.id) as A,"
                + "(SELECT stockID, sum(quantity) as sum_quantity FROM stadium_manager.import_bill  where 1=1 ";

        if (startTime != null && !startTime.equals("")) {
            query += "and import_bill.date >= '" + startTime +"'";
        }
        if (endTime != null && !endTime.equals("")) {
            query += "and import_bill.date <= '" + endTime + "'";
        }
        query += " group by stockID) as B where A.stock_id=B.stockID group by supplier_id order by sum(A.price*B.sum_quantity) desc";

        Connection connection = ConnectJDBC.getConn();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                SupplierAnalysis supplierAnalysis = new SupplierAnalysis();
                supplierAnalysis.setId(resultSet.getString(1));
                supplierAnalysis.setCode(resultSet.getString(2));
                supplierAnalysis.setName(resultSet.getString(3));
                supplierAnalysis.setQuantity(resultSet.getString(4));
                supplierAnalysis.setPrice(String.valueOf(resultSet.getBigDecimal(5)));

                supplierList.add(supplierAnalysis);
            }

            statement.close();
            resultSet.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierAnalysisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return supplierList;
    }

    public static List<ImportSupplier> importByTime(String startTime, String endTime, String supplierId, int userID) {
        List<ImportSupplier> importList = new ArrayList<>();

        String query = "select A.supplier_id, B.import_date as import_date, A.supplier_name, B.sum_quantity as total_quantity, A.stock_price*sum(B.sum_quantity) as total_price "
                + "from (select stock.id as stock_id, supplier.id as supplier_id, stock.price as stock_price, supplier.name as supplier_name, supplier.code as supplier_code "
                + "from stock inner join supplier on supplier.userID=" + userID + " and stock.supplierId=" + supplierId + " and stock.supplierId = supplier.id ) as A,"
                + "(SELECT stockID, sum(quantity) as sum_quantity, import_bill.date as import_date "
                + "FROM import_bill  where 1=1 ";

        if (startTime != null && !startTime.isEmpty()) {
            query += "and import_bill.date >= '" + startTime + "' ";
        }
        if (endTime != null && !endTime.isEmpty()) {
            query += "and import_bill.date <= '" + endTime + "' ";
        }
        query += "group by import_bill.date, stockID) as B where A.stock_id=B.stockID group by import_date order by import_date ASC";

        Connection connection = ConnectJDBC.getConn();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                ImportSupplier importSupplier = new ImportSupplier();
                importSupplier.setId(resultSet.getString(1));
                importSupplier.setDate(resultSet.getString(2));
                importSupplier.setName(resultSet.getString(3));
                importSupplier.setQuantity(resultSet.getString(4));
                importSupplier.setPrice(String.valueOf(resultSet.getBigDecimal(5)));

                importList.add(importSupplier);
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
