package com.capgemin.designpattern.singleton;

public class DatabaseConnection {

	static DatabaseConnection conn=null;
	private DatabaseConnection()	
	{
		
	}
	
	public static DatabaseConnection getConnection()
	{
		if(conn==null)
		{
			conn=new DatabaseConnection();
			 
		}
		return conn;
		 
	}
	
}
