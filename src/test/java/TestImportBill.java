import org.junit.Assert;
import org.junit.Test;
import stadium_manager.Dao.ImportBillDAO;
import stadium_manager.Model.DetailImportBill;

import java.util.HashMap;
import java.util.List;

public class TestImportBill {

    @Test
    public void getDetailImportBillValid() {
        List<DetailImportBill> detailBill = ImportBillDAO.detailImportByDate("3", "2020-12-14", 1);
        Assert.assertTrue(detailBill.size() > 0);
    }

    @Test
    public void getDetailImportBillWrongDate() {
        List<DetailImportBill> detailBill = ImportBillDAO.detailImportByDate("3", "2021-12-14", 1);
        Assert.assertEquals(detailBill.size(), 0);
    }

    @Test
    public void getDetailImportBillNotDate() {
        List<DetailImportBill> detailBill = ImportBillDAO.detailImportByDate("3", "", 1);
        Assert.assertEquals(detailBill.size(), 0);
    }

    @Test
    public void getDetailImportBillNotSupplierID() {
        List<DetailImportBill> detailBill = ImportBillDAO.detailImportByDate("", "2020-12-14", 1);
        Assert.assertEquals(detailBill.size(), 0);
    }
}
