package ru.javavision.dao;

import ru.javavision.model.Message;
import ru.javavision.model.User;
import ru.javavision.util.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static ru.javavision.util.DBUtils.getConnection;

/**
 * Created by Михаил on 28.05.2019.
 */

public class UserDao {
//    Connection connection;
//    public UserDao() {
//        DBUtils dbUtils = new DBUtils();
//
//        try {
//            connection = dbUtils.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
   Connection connection = getConnection();

    public UserDao() throws SQLException, ClassNotFoundException {
    }


    public void userRegistration(User user) {
//        try {
//
//            String query = " insert into userProfale(login, password) " + "values(null, '" + userProfale.getContent() + "')";
//            System.out.println(query);
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(query);
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }
    }

    public User findARegisteredUser( String login, String password) {
        User user=null;
        try {

            String query = "select * from userprofile where login = '" + login + "' and password = '"+password+"'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                user = new User(rs.getString("login"), rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return user;
    }
    public void deleteUser(String login, String password) {
        try {

            String query = String.format("delete from userprofile where login, password = %d", login, password);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public void addUser(User user) {
        try {

            String query = String.format("insert into userprofile (id, login, password) values(null, '%s', '%s')", user.getLogin(), user.getPassword());
            System.out.println(query);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
