package com.capgemin.designpattern.singleton.test;

import com.capgemin.designpattern.singleton.DatabaseConnection;

public class DBConTest {

	public static void main(String[] args) {
		
		DatabaseConnection con= DatabaseConnection.getConnection();
	}

}
