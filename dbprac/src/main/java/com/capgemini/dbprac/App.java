package com.capgemini.dbprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
       
    	//insertData();
    	printData();
    	
    }
    public static void printData()
    {
    	 String dbURL = "jdbc:postgresql://localhost:5432/javardbmsprac";
         String username = "postgres";
         String password = "JayantaLM1$";
         System.out.println("--Print Data");
         
         try {
        	 Connection con= DriverManager.getConnection(dbURL, username, password);
        	 Statement stmt= con.createStatement();
        	 String sql= "select * from employee";
        	 
        	 ResultSet rs=stmt.executeQuery(sql);
             
             
        	 while(rs.next())
        	 {
     
//        		 System.out.println("id="+rs.getInt(1)+" emp_name="+rs.getString(2));
        		 System.out.println("id="+rs.getInt("id")+" emp_name="+rs.getString("emp_name"));
        	 }
        	 
         }catch(Exception ex)
         {
        	ex.printStackTrace();
        	 
         }
    	
    }
    
    public static void insertData()
    {
    	 String dbURL = "jdbc:postgresql://localhost:5432/javardbmsprac";
         String username = "postgres";
         String password = "JayantaLM1$";
    	
    	 try {
			Connection conn= DriverManager.getConnection(dbURL, username, password) ;
			Statement stmt= conn.createStatement();
			String sql="insert into employee (emp_name) values('Vasu')";
			stmt.execute(sql);
			System.out.println("Data inserted successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	
    }
    
}
