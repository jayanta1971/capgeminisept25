package com.capgemini.dbprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	 String dbURL = "jdbc:postgresql://localhost:5432/javardbmsprac";
         String username = "postgres";
         String password = "JayantaLM1$";
    	
    	 try {
			Connection conn= DriverManager.getConnection(dbURL, username, password) ;
			Statement stmt= conn.createStatement();
			String sql="insert into employee (emp_name) values('Amit')";
			stmt.execute(sql);
			System.out.println("Data inserted successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	
    	
    }
}
