package stadium_manager.Controller;

import stadium_manager.Dao.ImportBillDAO;
import stadium_manager.Dao.SupplierDAO;
import stadium_manager.Model.DetailImportBill;
import stadium_manager.Model.Supplier;
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


@WebServlet(urlPatterns = {"/detail-import/supplier/*"})
public class DetailImportController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String date = req.getParameter("date");

        User user = (User) req.getSession().getAttribute("user");
        int userID = user.getID();

        String pathInfo = req.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        String supplierId = pathParts[1];

        Supplier supplier = new SupplierDAO().getByID(Integer.parseInt(supplierId));
        String supplierName = supplier.getName();

        List<DetailImportBill> detailList = ImportBillDAO.detailImportByDate(supplierId, date, userID);

        HttpSession session = req.getSession();
        session.setAttribute("pageActive", "analysis");

        req.setAttribute("date", date);
        req.setAttribute("detailList", detailList);
        req.setAttribute("supplierName", supplierName);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/detail_import.jsp");
        requestDispatcher.forward(req, resp);
    }
}
