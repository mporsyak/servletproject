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


@WebServlet( "/user/UpdateMessageServlet")
public class UpdateMessageServlet extends HttpServlet {

    private MesseageService messageService = new MesseageService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        int id = Integer.valueOf(req.getParameter("id"));
        String content = req.getParameter("content");

        messageService.updateMessage( id,  content);
        //req.getRequestDispatcher("/WEB-INF/view/update.jsp").forward(req, resp);
        resp.sendRedirect(  "/user/content");

//        int id = Integer.valueOf(req.getParameter("id"));
//
//        Message mes = messageService.getMessage(id);
//        req.setAttribute("message", mes);
//
//        req.getRequestDispatcher("/WEB-INF/view/update.jsp").forward(req, resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));

        Message mes = messageService.getMessage(id);
        req.setAttribute("message", mes);

        req.getRequestDispatcher("/WEB-INF/view/update.jsp").forward(req, resp);


//        req.setCharacterEncoding("UTF-8");
//
//        int id = Integer.valueOf(req.getParameter("id"));
//        String content = req.getParameter("content");
//
//        messageService.updateMessage( id,  content);
//        //req.getRequestDispatcher("/WEB-INF/view/update.jsp").forward(req, resp);
//        resp.sendRedirect(  "/user/content");
    }
}
