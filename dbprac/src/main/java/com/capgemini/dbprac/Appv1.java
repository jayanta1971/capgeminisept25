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

		boolean flag = true;
		while (flag) {
			System.out.println("----Menu-----");
			System.out.println("----1. Print -----");
			System.out.println("----2. New Record -----");
			System.out.println("----3. Update Record -----");
			System.out.println("----4. Delete Record -----");
			System.out.println("----5. Quit -----");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if (input == 1) {
				printData();
			} else if (input == 2) {

				insertData();
			}
			else if (input == 3) {

				updateData();
			}
			else if (input == 4) {

				deleteData();
			}
						
			else if (input == 5) {

				break;
			} else {
				System.out.println("Invalid Input");

			}

		}

	}

	public static void printData() {

		System.out.println("--Print Data");

		try {
			Connection con = DriverManager.getConnection(dbURL, username, password);
			Statement stmt = con.createStatement();
			String sql = "select * from employee";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

//	        		 System.out.println("id="+rs.getInt(1)+" emp_name="+rs.getString(2));
				System.out.println("id=" + rs.getInt("id") + " emp_name=" + rs.getString("emp_name"));
			}
			con.close();
			con=null;
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	public static void insertData() {

		try {
			System.out.println("Please enter the employee name");
			Scanner sc = new Scanner(System.in);
			String empName = sc.next();

			Connection conn = DriverManager.getConnection(dbURL, username, password);
			String sql = "insert into employee (emp_name,emp_age) values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, empName);
			
			ps.execute();
			conn.close();
			conn=null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updateData() {
		System.out.println("Please enter the employee id to update");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out.println("Please enter the employee name to update");
		String empName = sc.next();
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			String sql = "update employee set emp_name=? where id =?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, empName);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			conn.close();
			conn=null;
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public static void deleteData() {
		System.out.println("Please enter the employee id to delete");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		 
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			String sql = "delete from employee  where id =?";
			
			PreparedStatement ps = conn.prepareStatement(sql);			 
			ps.setInt(1, id);			
			ps.execute();
			conn.close();
			conn=null;
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
