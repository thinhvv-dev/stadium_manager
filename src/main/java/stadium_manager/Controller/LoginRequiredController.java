package stadium_manager.Controller;

import stadium_manager.Model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


@WebFilter(urlPatterns = {"/*"})
public class LoginRequiredController implements Filter {
    private static final Set<String> ALLOWED_PATHS = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList("", "/login", "/logout")));
    private static final Set<String> LOGINED_PATH = Collections.unmodifiableSet(new HashSet<>(
            Collections.singletonList("/login")));

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();

        String path = req.getRequestURI().substring(req.getContextPath().length()).replaceAll("[/]+$", "");
        boolean allowedPath = ALLOWED_PATHS.contains(path);
        boolean loginPath = LOGINED_PATH.contains(path);
        boolean staticPath = req.getRequestURI().startsWith("/static/");

        User user = (User) session.getAttribute("user");
        if (!staticPath) {
            if (user != null && loginPath) {
                resp.sendRedirect("/home");
            }
            else if (user == null && !allowedPath) {
                resp.sendRedirect("/login");
            } else {
                chain.doFilter(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }

    }
}
