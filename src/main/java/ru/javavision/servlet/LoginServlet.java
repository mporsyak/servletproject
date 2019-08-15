package ru.javavision.servlet;

import ru.javavision.model.User;
import ru.javavision.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UserService userService = new UserService();
//       // int id = Integer.valueOf(req.getParameter("id"));
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");
//        User user = userService.deleteUser(login,password);
//        if (password.equals(user.getPassword())) {
//            getServletContext().log("");
//
//            request.getSession().setAttribute("login", login);
//            response.sendRedirect("loginForm.jsp");
//            getServletContext().log("");
//        }
        request.getRequestDispatcher("/WEB-INF/view/loginForm.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/loginForm.jsp").forward(request, response);
    }
}

