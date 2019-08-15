package ru.javavision.servlet;

import ru.javavision.model.User;
import ru.javavision.service.UserService;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Name;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter("/user/*")
//@WebFilter(urlPatterns = { "/content" }, initParams = {
//        @WebInitParam(name = "content", value = "/index/loginForm/") })
public class FilterServlet implements Filter {
    private UserService userService = new UserService();


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");


        String login = servletRequest.getParameter("login");
        String password = servletRequest.getParameter("password");
        System.out.println(login+" "+password);

        User user = userService.findARegisteredUser(login, password);
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        Object auth = req.getSession().getAttribute("auth");

        if(auth != null || (login!=null && password!=null && user!=null)){
            req.getSession().setAttribute("auth", true);
            filterChain.doFilter(servletRequest, servletResponse);
            //res.sendRedirect(req.getContextPath() + Paths.GetIndexPageServletPath);

        }  else{
            servletRequest.setAttribute("info", "Неверный логин или пароль");

            HttpServletResponse res = (HttpServletResponse)servletResponse;
            res.sendRedirect("/login");
            //servletRequest.getRequestDispatcher("/login").forward(servletRequest, servletResponse);
            //req.getRequestDispatcher("/WEB-INF/view/loginForm.jsp").forward(req, res);
         }


    }

    @Override
    public void destroy() {

    }
}

