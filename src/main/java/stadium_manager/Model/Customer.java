package stadium_manager.Model;

public class Customer {
    private int ID;
    private String name;
    private String phone;
    private String address;
    private int userID;

    public Customer() {
    }

    public Customer(int ID, String name, String phone, String address, int userID) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.userID = userID;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
