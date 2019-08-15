package ru.javavision.servlet;

import ru.javavision.model.Message;
import ru.javavision.service.MesseageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@WebServlet("/user/DeleteMessageServlet")
public class DeleteMessageServlet extends HttpServlet {

    private MesseageService messageService = new MesseageService();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        int id = Integer.valueOf(req.getParameter("id"));
        messageService.deleteMessage(id);

        resp.sendRedirect(req.getContextPath() + "/user/content");
    }
}
