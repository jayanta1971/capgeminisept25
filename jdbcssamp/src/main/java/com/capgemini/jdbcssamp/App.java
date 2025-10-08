package com.capgemini.jdbcssamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String dbURL = "jdbc:postgresql://localhost:5432/ecomdb";
        String username = "postgres";
        String password = "JayantaLM1$";

        try {
            //Class.forName("org.postgresql.Driver");
            try (Connection con = DriverManager.getConnection(dbURL, username, password);
                 Statement st = con.createStatement()) {

            	String sql = "insert into user_details (name) values ('{Amit}')";
                st.execute(sql);
                System.out.println("Record inserted successfully");

            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}