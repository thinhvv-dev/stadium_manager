package stadium_manager.Model;

import java.util.Date;

public class RentalSlip {
    private int ID;
    private int customerID;
    private int stadiumID;
    private Date date;
    private int userId;


    public RentalSlip() {
    }

    public RentalSlip(int ID, int customerID, int stadiumID, Date date, int userId) {
        this.ID = ID;
        this.customerID = customerID;
        this.stadiumID = stadiumID;
        this.date = date;
        this.userId = userId;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getStadiumID() {
        return stadiumID;
    }

    public void setStadiumID(int stadiumID) {
        this.stadiumID = stadiumID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
