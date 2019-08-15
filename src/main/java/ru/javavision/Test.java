package ru.javavision;

import java.sql.*;

/**
 * Created by Михаил on 22.04.2019.
 */
public class Test {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/mytest";
    public static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    public static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {


        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
            System.out.print("Соединенеие установлено");



        } catch (SQLException e) {
            System.out.print(e);
        }

    }
}
