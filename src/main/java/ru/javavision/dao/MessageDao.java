package ru.javavision.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import ru.javavision.model.Message;
import ru.javavision.util.DBUtils;

import java.util.ArrayList;

import static ru.javavision.util.DBUtils.getConnection;

public class MessageDao {
//    private Connection connection;
//
//
//    public MessageDao() {
//        DBUtils dbUtils = new DBUtils();
//        try {
//            connection = dbUtils.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
Connection connection = getConnection();

    public MessageDao() throws SQLException, ClassNotFoundException {
    }


    public void addMessage(Message message) {
        try {

            String query = " insert into messege(id, content) " + "values(null, '" + message.getContent() + "')";
            System.out.println(query);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }


    public Message getMessage(int id) {
        Message mes = null;
        try {

            String query = "select * from messege where id = " + id;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                mes = new Message(rs.getInt("id"), rs.getString("content"));

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return mes;
    }

    public ArrayList<Message> findMessageByContainsInContent(String content) {
        ArrayList<Message> list = new ArrayList<>();
        try {

            String query = "select * from messege where content LIKE '%" + content + "%'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Message mes = new Message(rs.getInt("id"), rs.getString("content"));
                list.add(mes);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return list;
    }

    public ArrayList<Message> getMessages() {
        ArrayList<Message> list = new ArrayList<>();
        try {

            String query = "select * from messege";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Message mes = new Message(rs.getInt("id"), rs.getString("content"));
                list.add(mes);

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return list;
    }

    public void deleteMessage(int id) {
        try {

            String query = String.format("delete from messege where id = %d", id);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void updateMessage(int id, String content) {
        try {

            String query = String.format("update messege set content = '%s' where id = %d", content, id);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}





