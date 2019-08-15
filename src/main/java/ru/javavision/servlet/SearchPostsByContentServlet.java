package ru.javavision.servlet;

import ru.javavision.model.Message;
import ru.javavision.service.MesseageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Михаил on 26.05.2019.
 */
@WebServlet("/user/SearchPostsByContentServlet")
public class SearchPostsByContentServlet extends HttpServlet{

    private MesseageService messageService = new MesseageService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

       String content = req.getParameter("content");

        ArrayList<Message> list = messageService.findMessageByContainsInContent(content);
        req.setAttribute("searchResultList", list);
        req.getRequestDispatcher("/WEB-INF/view/saerch.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.sendRedirect(req.getContextPath() + "/user/content");
    }
}

