package com.student.manage;

public class Student {

	private int studentId;
	private String studentName;
	private String studentCity;
	private String studentPhone;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentName, String studentCity, String studentPhone) {
		super();
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentPhone = studentPhone;
	}
	
	public Student(int studentId, String studentName, String studentCity, String studentPhone) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentPhone = studentPhone;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	

	@Override
	public String toString() {
		return "Student [ studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ",  studentPhone=" + studentPhone + "]";
	}
}
