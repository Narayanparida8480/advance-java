package org.example;


    import java.sql.*;

    public class DBConnection {

        static String url = "jdbc:mysql://localhost:3306/studentdb";
        static String username = "root";
        static String password = "Narayan@8480395391"; // Change to your MySQL password

        public static Connection getConnection() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                return DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
            return null;
        }
    }


