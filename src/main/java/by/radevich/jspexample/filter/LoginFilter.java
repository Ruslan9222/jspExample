package by.radevich.jspexample.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        var path = ((HttpServletRequest)servletRequest).getServletPath();
        var login = ((HttpServletRequest)servletRequest).getSession()
                .getAttribute("login");
        var currendLogin = servletRequest.getParameter("login");
        if ("/".equals(path) || login !=null ){
            filterChain.doFilter(servletRequest,servletResponse);
        }else if(currendLogin !=null) {
            ((HttpServletRequest) servletRequest).getSession().setAttribute("login", currendLogin);
        }else{
                servletRequest.getRequestDispatcher("index.jsp").forward(servletRequest,servletResponse);
            }
        }
    }
