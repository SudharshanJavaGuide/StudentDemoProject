package com.insudharshanit.bean;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAddr;
	
	public Student(int studentId,String studentname,String studentAddr) {
		this.studentId=studentId;
		this.studentName=studentname;
		this.studentAddr=studentAddr;
	}
	public static void main(String[] args) {
		Student s1=new Student(1001,"Sudharshan","Kadapa");
		Student s2=new Student(1002,"Indra","Chittoor");
	}
}
