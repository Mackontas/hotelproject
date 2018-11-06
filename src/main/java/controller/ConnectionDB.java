package controller;

import java.sql.*;

public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/hotel?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {

        Connection connection;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Correct connection to DB");
            } else {
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
