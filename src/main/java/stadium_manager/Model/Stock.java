package stadium_manager.Model;

public class Stock {
    private int ID;
    private String name;
    private float price;
    private int quantity;
    private int supplierID;
    private int userId;

    public Stock() {
    }

    public Stock(int ID, String name, float price, int quantity, int supplierID, int userId) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.supplierID = supplierID;
        this.userId = userId;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
