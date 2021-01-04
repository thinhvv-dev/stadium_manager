package stadium_manager.Model;

public class Stadium {
    private int ID;
    private String name;
    private int userID;

    public Stadium() {
    }

    public Stadium(int ID, String name, int userID) {
        this.ID = ID;
        this.name = name;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
