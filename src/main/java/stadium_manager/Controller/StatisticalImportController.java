package stadium_manager.Controller;

import stadium_manager.Dao.SupplierAnalysisDAO;
import stadium_manager.Model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


@WebServlet(urlPatterns = {"/statistical-import/*"})
public class StatisticalImportController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startDate = null;
        String endDate = null;
        if (req.getQueryString() != null) {
            String[] queryString = req.getQueryString().split("&");
            startDate = queryString[0].split("=")[1];
            endDate = queryString[1].split("=")[1];
        }

        User user = (User) req.getSession().getAttribute("user");
        int userID = user.getID();

        String pathInfo = req.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        String supplierId = pathParts[1];

        List<HashMap<String, String>> importList = SupplierAnalysisDAO.importByTime(startDate, endDate, supplierId, userID);

        req.setAttribute("importList", importList);
        req.setAttribute("startDate", startDate);
        req.setAttribute("endDate", endDate);
        req.setAttribute("supplierID", supplierId);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/statistical_import.jsp");
        requestDispatcher.forward(req, resp);
    }
}
