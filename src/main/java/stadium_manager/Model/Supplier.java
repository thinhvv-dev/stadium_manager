package stadium_manager.Model;

public class Supplier {
    private int ID;
    private String name;
    private String code;
    private int userID;

    public Supplier() {
    }

    public Supplier(int ID, String name, String code, int userID) {
        this.ID = ID;
        this.name = name;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
