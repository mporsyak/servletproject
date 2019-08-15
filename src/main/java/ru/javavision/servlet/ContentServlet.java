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


@WebServlet("/user/content")
public class ContentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MesseageService messeageService = new MesseageService();
        ArrayList<Message> list = messeageService.getMessages();
        System.out.println("GET");
        for(Message mes : list){
            System.out.println(mes.getContent());
        }
        request.setAttribute("messages", list);
        request.getRequestDispatcher("/WEB-INF/view/messege.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MesseageService messeageService = new MesseageService();
        ArrayList<Message> list = messeageService.getMessages();
        System.out.println("POST");
        for(Message mes : list){
            System.out.println(mes.getContent());
        }
        request.setAttribute("messages", list);
        request.getRequestDispatcher("/WEB-INF/view/messege.jsp").forward(request, response);
    }
}
