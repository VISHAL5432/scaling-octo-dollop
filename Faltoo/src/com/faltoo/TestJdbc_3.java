package com.faltoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbc_3 {
  // using prepared Statement
	public void insertRecord() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Department : ");
		String dep = sc.nextLine();
		System.out.println("Enter Subject : ");
		String sub = sc.nextLine();
		System.out.println("Enter Email : ");
		String mail = sc.nextLine();
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		System.out.println("Enter Salary : ");
		double sal = sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Boys","root","6553");
				PreparedStatement st = con.prepareStatement("insert into boy1(sid,s_name, s_depatment,s_sub,s_age,s_email,s_salary)values(?,?,?,?,?,?,?)");
				st.setInt(1, id);
				st.setString(2, name);
				st.setString(3,dep);
				st.setString(4,sub);
				st.setInt(5, age);
				st.setString(6,mail);
				st.setDouble(7, sal);
				int i = st.executeUpdate();
				
				if(i!=0) {
					System.out.println(i+"Record Updated");
				}
				}catch(SQLException|ClassNotFoundException e) {
					e.printStackTrace();
	}
}
	public void deleteRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		int id =sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Boys","root","6553");
			PreparedStatement st = con.prepareStatement("");
			int i = st.executeUpdate();
			 if(i!=0) {
				System.out.println(i+"Record Updated");
			}
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();
}
		}
	public  void updateRecord() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Depat :  ");
		String dept = sc.nextLine();
		System.out.println("Enter Sub_Name : ");
		String sub = sc.nextLine();
		System.out.println("Enter Email_id : ");
		String mail = sc.nextLine();
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Age : ");
		int age =sc.nextInt();
		System.out.println("Enter Salary : ");
		double sal = sc.nextDouble();
		
//		try { 
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Boys","root","6553");
//			PreparedStatement ps = con.prepareStatement{
//				"Update boy01 set name = ?, depa"
//			}
//		}
		
	}
	}
