package stadium_manager.Controller;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession session = request.getSession();
        session.setAttribute("pageActive", "home");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
        requestDispatcher.forward(request, response);
    }
}