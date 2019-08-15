package ru.javavision.servlet;

import ru.javavision.model.User;
import ru.javavision.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/adduser")
public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        UserService userService = new UserService();
        User user = new User(login, password);
        userService.addUser(user);
        request.getSession().setAttribute("auth", true);
        //request.getRequestDispatcher("/user/content").forward(request, response);
        response.sendRedirect("/user/content");
    }
}
