package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	public static boolean insertStudentDB(Student st) {
		boolean f=false;
		
		try {
			//jdbc code
			Connection con = CP.createConn();
			String q = "insert into student(sname,sphone,scity) values(?,?,?)";
			// ?- Dynamicquery  so to give values usinge prepadeStaement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentCity());
			pstmt.setString(3, st.getStudentPhone());
			//exicute
			pstmt.executeUpdate();
			f=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
		
	}
	

	public static boolean delectStudent(int userId) {
		
		boolean f=false;
				
		try {
			//jdbc code
			Connection con = CP.createConn();
			String q = "delete from student where sid=?";
			// ?- Dynamicquery  so to give values usinge prepadeStaement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of parameter
			pstmt.setInt(1, userId);
			//exicute
			pstmt.executeUpdate();
			f=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
		
	}

	
	public static void viewStudent(int userId) {
		
		try {
			Connection con = CP.createConn();
			String q = "select * from student where sid = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, userId);
			//Execute the select query and obtain the result set
			ResultSet set =pstmt.executeQuery();
			while(set.next()) {
				int id= set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);	
				System.out.println("Student Id :"+id);
				System.out.println("Student Name :"+name);
				System.out.println("Student Phone Number :"+phone);
				System.out.println("Student City :"+city);
				System.out.println("----------------------------");
				
			}
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
	
		return ;
	}
	
	
	public static void viewAllStudent() {
		
		try {
			Connection con = CP.createConn();
			String q = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet set =stmt.executeQuery(q);
			while(set.next()) {
				int id= set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(2);
				String city = set.getString(2);	
				System.out.println("Student Id :"+id);
				System.out.println("Student Name :"+name);
				System.out.println("Student Phone Number :"+phone);
				System.out.println("Student City :"+city);
				System.out.println("----------------------------");
				
			}
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		System.out.println("---------------------------- list done -----------------------------------");
		System.out.println("");
		return ;
	}


	public static boolean updateStudent(Student st , int userId) {
boolean f=false;
		
		try {
			//jdbc code
			Connection con = CP.createConn();
			String q = "update student set sname=? , scity=? , sphone=? where sid=?";
			// ?- Dynamicquery  so to give values usinge prepadeStaement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentCity());
			pstmt.setString(3, st.getStudentPhone());
			pstmt.setInt(4,userId);
			//exicute
			pstmt.executeUpdate();
			f=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
		
	}

	

	
}
