package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	static Connection con ;
	
	public static Connection createConn() throws SQLException  {
//1.load the Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
	
			String userName="root";
			String password="root";	
			String url = "jdbc:mysql://localhost:3307/student_manage";

//2.connection creating
			con = DriverManager.getConnection(url ,userName,password);
			
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		return con;
		
	}

}
