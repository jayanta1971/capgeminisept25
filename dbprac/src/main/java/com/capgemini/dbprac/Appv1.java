package com.capgemini.dbprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Appv1 {

	 static String dbURL = "jdbc:postgresql://localhost:5432/javardbmsprac";
	 static String username = "postgres";
	 static String password = "JayantaLM1$";
	public static void main(String[] args) {
		 
		boolean flag=true;
		while(flag)
		{
			System.out.println("----Menu-----");
			System.out.println("----1. Print -----");
			System.out.println("----2. New Record -----");
			System.out.println("----3. Quit -----");
    		Scanner sc= new Scanner(System.in);
    		int input=sc.nextInt();
    		if(input==1)
    		{
    			printData();
    		}else if(input==2){
    			
    			insertData();
    		}
    			else if(input==3){
    			
    			break;
    		}
    			else {
    				System.out.println("Invalid Input");
    				

    			}
			
			
		}
	 
		
	}
	
	 public static void printData()
	    {
	    	 
	         System.out.println("--Print Data");
	         
	         try {
	        	 Connection con= DriverManager.getConnection(dbURL, username, password);
	        	 Statement stmt= con.createStatement();
	        	 String sql= "select * from employee";
	        	 
	        	 ResultSet rs=stmt.executeQuery(sql);
	             
	             
	        	 while(rs.next())
	        	 {
	     
//	        		 System.out.println("id="+rs.getInt(1)+" emp_name="+rs.getString(2));
	        		 System.out.println("id="+rs.getInt("id")+" emp_name="+rs.getString("emp_name"));
	        	 }
	        	 
	         }catch(Exception ex)
	         {
	        	ex.printStackTrace();
	        	 
	         }
	    	
	    }
		
		
 
	public static void insertData()
    {
    	
    	
    	 try {
    		System.out.println("Please enter the employee name");
    		Scanner sc= new Scanner(System.in);
    		String empName=sc.next();
    		 
			Connection conn= DriverManager.getConnection(dbURL, username, password) ;
			String sql="insert into employee (emp_name) values(?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, empName);
			ps.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
