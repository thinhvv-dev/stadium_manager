package stadium_manager.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/error"})
public class ErrorHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processError(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processError(req, resp);
    }

    private void processError(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Throwable throwable = (Throwable) request
                .getAttribute("javax.servlet.error.exception");

        Integer statusCode = (Integer) request
                .getAttribute("javax.servlet.error.status_code");

        String servletName = (String) request
                .getAttribute("javax.servlet.error.servlet_name");

        if (servletName == null) {
            servletName = "Unknown";
        }

        request.setAttribute(
                "error", "Servlet "
                        + "status " + statusCode + "\n "
                        + "exception" + throwable.getClass().getName() + " : "
                        + throwable.getMessage());
        request.getRequestDispatcher("/error_page.jsp").forward(request, response);
    }
}
