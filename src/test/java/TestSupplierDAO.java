import org.junit.Assert;
import org.junit.Test;
import stadium_manager.Dao.SupplierDAO;
import stadium_manager.Model.Supplier;

public class TestSupplierDAO {

    @Test
    public void testGetSupplierDAOExist() {
        Supplier supplier = new SupplierDAO().getByID(1);
        Assert.assertNotNull(supplier.getName());
    }

    @Test
    public void testGetSupplierDAONotExist() {
        Supplier supplier = new SupplierDAO().getByID(1111111);
        Assert.assertNull(supplier.getName());
    }
}
