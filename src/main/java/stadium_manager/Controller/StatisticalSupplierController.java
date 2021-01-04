package stadium_manager.Controller;

import stadium_manager.Dao.SupplierAnalysisDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


@WebServlet(urlPatterns = {"/statistical-supplier"})
public class StatisticalSupplierController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");

        List<HashMap<String, String>> supplierList = SupplierAnalysisDAO.getByTime(startDate, endDate);
        req.setAttribute("supplierList", supplierList);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/statistical_supplier.jsp");
        requestDispatcher.forward(req, resp);
    }
}
