package ru.javavision.servlet;

import ru.javavision.model.Message;
import ru.javavision.service.MesseageService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/AddMessageServlet")
public class AddMessageServlet extends HttpServlet {
    private MesseageService messeageService;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Object messages = getServletContext().getAttribute("messages");

        messeageService = new MesseageService();
        req.setCharacterEncoding("UTF-8");

        String content = req.getParameter("content");
        Message message = new Message(content);

        messeageService.addMessage(message);
        resp.sendRedirect(req.getContextPath() + "/user/content");
    }
}
