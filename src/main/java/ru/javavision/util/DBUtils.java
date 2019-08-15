package ru.javavision.util;


import javax.servlet.ServletRequest;
import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


//public  class DBUtils {
//    public Connection getConnection() throws SQLException {
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        return DriverManager.getConnection("jdbc:mysql://localhost:3306/messege?serverTimezone=UTC", "root", "root");
//    }
//}
public class DBUtils {

    public static Connection getConnection()
            throws ClassNotFoundException, SQLException {

        String hostName = "localhost";
        String dbName = "messege";
        String userName = "root";
        String password = "root";
        return getConnection(hostName, dbName, userName, password);
    }

    public static Connection getConnection(String hostName, String dbName,
                                           String userName, String password) throws SQLException,
            ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");


        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName+"?serverTimezone=UTC";

        Connection connection = DriverManager.getConnection(connectionURL, userName,
                password);
        return connection;
    }
}
