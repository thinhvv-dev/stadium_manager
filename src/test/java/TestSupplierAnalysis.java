import org.junit.Assert;
import org.junit.Test;
import stadium_manager.Dao.SupplierAnalysisDAO;
import stadium_manager.Model.ImportSupplier;
import stadium_manager.Model.SupplierAnalysis;

import java.util.HashMap;
import java.util.List;

public class TestSupplierAnalysis {

    @Test
    public void getListSupplierByTimeHasData() {
        List<SupplierAnalysis> listSupplier = SupplierAnalysisDAO.supplierByTime("2020-12-10", "2021-01-01", 1);

        Assert.assertTrue(listSupplier.size() > 0);
    }

    @Test
    public void getListSupplierByTimeNotData() {
        List<SupplierAnalysis> listSupplier = SupplierAnalysisDAO.supplierByTime("2021-10-10", "2021-12-01", 1);

        Assert.assertEquals(0, listSupplier.size());
    }

    @Test
    public void getListSupplierByNotEndTime() {
        // get all data from start time to now
        List<SupplierAnalysis> listSupplier = SupplierAnalysisDAO.supplierByTime("2020-10-10", "", 1);

        Assert.assertTrue(listSupplier.size() > 0);
    }

    @Test
    public void getListSupplierByNotStartTime() {
        // get all data from end time to before
        List<SupplierAnalysis> listSupplier = SupplierAnalysisDAO.supplierByTime("", "2021-12-01", 1);

        Assert.assertTrue(listSupplier.size() > 0);
    }

    @Test
    public void getListImportByTimeOfSupplier() {
        List<ImportSupplier> importList = SupplierAnalysisDAO.importByTime("2020-12-10", "2021-12-01", "3", 1);

        Assert.assertTrue(importList.size() > 0);
    }

    @Test
    public void getListImportByTimeOfSupplierNotEndTime() {
        List<ImportSupplier> importList = SupplierAnalysisDAO.importByTime("2020-12-10", "", "3", 1);

        Assert.assertTrue(importList.size() > 0);
    }

    @Test
    public void getListImportByTimeOfSupplierNotStartTime() {
        List<ImportSupplier> importList = SupplierAnalysisDAO.importByTime("", "2021-12-01", "3", 1);

        Assert.assertTrue(importList.size() > 0);
    }

    @Test
    public void getListImportByTimeOfSupplierNotSupplierID() {
        List<ImportSupplier> importList = SupplierAnalysisDAO.importByTime("2020-12-10", "2021-12-01", "", 1);

        Assert.assertEquals(0, importList.size());
    }
}
