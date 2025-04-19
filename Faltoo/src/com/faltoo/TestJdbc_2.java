package com.faltoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbc_2 {
	static Scanner sc;

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
		Statement st = con.createStatement();
		int i = st.executeUpdate
				("Insert into boy1 (sid , s_name,s_depatment, s_sub, s_age ,s_email,s_salary)"
					+ " values("+id+",'"+name+"','"+dep+"','"+sub+"',"+age+",'"+mail+"',"+sal+")");
			if (i!=0)
				System.out.println(i + "Record updated ");
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		private void deleteRcord() {
			Scanner sc = new Scanner(System.in);
			
			 System.out.println("Enter ID :");
			 int id = sc.nextInt();
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Boys","root","6553");
		Statement st = con.createStatement();
	     int i = st.executeUpdate("delete from boy1 where sid  = "+id+"");
						if (i!=0)
							System.out.println(i+"Record Deleted ");
						
			 }catch(SQLException| ClassNotFoundException e){
				 e.printStackTrace();
				 
			 }
		}
		public void updateRecord() {
			Scanner sc = new Scanner(System.in);
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
			float sal = sc.nextFloat();
  try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Boys","root","6553");
	  Statement st = con.createStatement();
		int i = st.executeUpdate("update  boy1 set  s_name'" + name+"',s_depatment='"+dep+"',"
				+ " s_sub='"+sub+"', s_age="+age+" ,s_email='"+mail+"',s_salary="+sal+""
						+ " where s_id = "+id+"");
							 
			if (i!=0)
				System.out.println(i + "Record updated ");
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		public void displayAllRecords()
		{
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Boys","root","6553");
				System.out.println(con);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from boy1");
				while (rs.next()) {
					System.out.println(rs.getInt("sid") + " " + rs.getString("s_name") + " "
							+ rs.getString("s_depatment") + " " + rs.getString("s_sub") 
							+ " " + rs.getInt("s_age") + " "
							+ rs.getString("s_email") + " " + rs.getDouble("s_salary"));
				}
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
			public static void main(String[] args) {
				TestJdbc_2 ob = new TestJdbc_2();
				Scanner ss = new Scanner(System.in);
				int choice = 0;
				 do {
					 System.out.println("Enter 1 for insert Record \n"
					 		+ " Enter 2 for Delete Record \n Enter 3 for update Record "
					 		+ "\n Enter 4 for Display All Records \n Enter 5 for exit from Operation :");
					 choice = ss.nextInt();
					 switch (choice) {
					 case 1 :
						 ob.insertRecord();
						 break;
					 case 2:
						 ob.deleteRcord();
						 break;
					 case 3:
						 ob.updateRecord();
						 break;
					 case 4:
						 ob.displayAllRecords();
						 break;
					 case 5:
						 System.out.println(" -: You got Exit :-");
						 break;
						 default:
							 System.out.println("Invalid Choice ");
					 }	
		}while(choice != 5);
		 

	}
		

}
