package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDAO;

public class Start {
	public static void main(String args[]) throws NumberFormatException, IOException {
		System.out.println("hellooooooo welcome to student magement app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
		System.out.println("PRESS 1 TO ADD STUDENT");
		System.out.println("PRESS 2 TO DELETE STUDENT ");
		System.out.println("PRESS 3 TO DISPLAY  STUDERNT WITH ID");
		System.out.println("PRESS 4 TO DISPLAY ALL STUDERNT");
		System.out.println("PRESS 5 TO UPDATE STUDERNT");
		System.out.println("PRESS 6 TO EXIT");
		
			int c =Integer.parseInt(br.readLine());
			
			//JDBC using here for curd
			if (c==1) {
				System.out.println(" Enter Student Name : ");
				String name = br.readLine();
				System.out.println("Enter Student City : ");
				String city = br.readLine();
				System.out.println("Enter Student Phone Number : ");
				String phone = br.readLine();
				
				//create student object to store student data
				
			    Student st = new Student(name,phone,city);
			    
			    boolean ans = StudentDAO.insertStudentDB(st);
			    System.out.println();
			    if(ans==true)
				    System.out.println("Student is Added Successfully !");
			    else
			    	System.out.println("Student Not Added! DB in Busy");
			    
				System.out.println();
				System.out.println(st);
				System.out.println();
				System.out.println();
				
			}else if(c==2) {
				System.out.println("Enter Student ID for Delete : ");
				int userId=Integer.parseInt(br.readLine());
				boolean ans=StudentDAO.delectStudent(userId);
				if(ans==true)
					System.out.println("Student Deleted!");
				else
					System.out.println("Student Not Deleted! Somthing went Wrong!...");
				
			}else if(c==3) {
				System.out.println("Entere Student Id for Displaying : ");
				int userId =Integer.parseInt(br.readLine());
				
				System.out.println("Student Displaying");
				StudentDAO.viewStudent(userId);
				
			}else if(c==4) {
				System.out.println("Displaying All Students");
				StudentDAO.viewAllStudent();
				
			}else if(c==5) {
				System.out.println("Enter Id for Update the Student :  ");
				int userId = Integer.parseInt(br.readLine());
				System.out.println(" Enter Updated Student Name : ");
				String name = br.readLine();
				System.out.println("Enter Updated Student City : ");
				String city = br.readLine();
				System.out.println("Enter Updated Student Phone Number : ");
				String phone = br.readLine();
				 Student st = new Student(name,phone,city);
				boolean ans =StudentDAO.updateStudent(st,userId);
				if(ans==true)
					System.out.println("Updated Student ");
				else
					System.out.println("Not Updated Student somthing went wrong!....... ");
			}else if(c==6) {
				System.out.println("Thankyou for using appilction. App is exiting now!");
				break;
			}else {
				System.out.println("Invalid selection");
			}	
		
		}
	}
}
