package stadium_manager.Model;

public class ImportSupplier {
    private String id;
    private String date;
    private String name;
    private String quantity;
    private String price;

    public ImportSupplier() {
    }

    public ImportSupplier(String id, String date, String name, String quantity, String price) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
