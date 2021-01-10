package stadium_manager.Controller;

import stadium_manager.Dao.SupplierAnalysisDAO;
import stadium_manager.Model.SupplierAnalysis;
import stadium_manager.Model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


@WebServlet(urlPatterns = {"/statistical-supplier"})
public class StatisticalSupplierController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        User user = (User) req.getSession().getAttribute("user");
        int userID = user.getID();

        List<SupplierAnalysis> supplierList = SupplierAnalysisDAO.supplierByTime(startDate, endDate, userID);

        HttpSession session = req.getSession();
        session.setAttribute("pageActive", "analysis");

        req.setAttribute("supplierList", supplierList);
        req.setAttribute("startDate", startDate);
        req.setAttribute("endDate", endDate);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/statistical_supplier.jsp");
        requestDispatcher.forward(req, resp);
    }
}
