package stadium_manager.Model;

import java.util.Date;

public class ImportBill {
    private int ID;
    private int stockID;
    private Date date;
    private int quantity;
    private int userID;

    public ImportBill() {
    }

    public ImportBill(int ID, int stockID, Date date, int quantity, int userID) {
        this.ID = ID;
        this.stockID = stockID;
        this.date = date;
        this.quantity = quantity;
        this.userID = userID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
