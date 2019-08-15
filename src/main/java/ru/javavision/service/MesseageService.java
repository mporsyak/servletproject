package ru.javavision.service;

import ru.javavision.dao.MessageDao;
import ru.javavision.model.Message;

import java.sql.SQLException;
import java.util.ArrayList;


public class MesseageService {

    private MessageDao messageDao;

    public MesseageService() {
        try {
            messageDao = new MessageDao();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addMessage(Message message) {
        messageDao.addMessage(message);
    }

    public Message getMessage(int id) {return messageDao.getMessage(id);}

    public ArrayList<Message> findMessageByContainsInContent(String content) {return messageDao.findMessageByContainsInContent(content);}

    public ArrayList<Message> getMessages(){
        return messageDao.getMessages();
    }

    public void deleteMessage(int id) {messageDao.deleteMessage(id);}

    public void updateMessage(int id, String content) {messageDao.updateMessage(id, content);
    }

}
