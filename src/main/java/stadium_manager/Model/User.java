package stadium_manager.Model;

public class User {
    private int ID;
    private String userName;
    private String password;

    public User() {
    }

    public User(int ID, String userName, String password) {
        this.ID = ID;
        this.userName = userName;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
