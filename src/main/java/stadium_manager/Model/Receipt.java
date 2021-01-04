package stadium_manager.Model;

import java.util.Date;

public class Receipt {
    private int ID;
    private int stockID;
    private int quantity;
    private Date date;
    private int rentalSlipID;
    private int userID;

    public Receipt() {
    }

    public Receipt(int ID, int stockID, int quantity, Date date, int rentalSlipID, int userID) {
        this.ID = ID;
        this.stockID = stockID;
        this.quantity = quantity;
        this.date = date;
        this.rentalSlipID = rentalSlipID;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRentalSlipID() {
        return rentalSlipID;
    }

    public void setRentalSlipID(int rentalSlipID) {
        this.rentalSlipID = rentalSlipID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
