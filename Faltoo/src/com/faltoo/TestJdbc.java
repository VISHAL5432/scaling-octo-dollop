package com.faltoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TestJdbc {

	public static void main(String[] args) {
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Day08","root","6553");
		
		Statement st = con.createStatement();
		//int it = st.executeUpdate(" insert into users values(11,'ashu','ashu@gmail.com', 26)");
//	    System.out.println(it+"Record Inserted : ");
 
//		int up = st.executeUpdate("  delete from users where s_name ='sishu'");
//		System.out.println(up+"Record deleted : ");
		int de = st.executeUpdate("update users set age = 80 where s_name ='tishu'");
		   System.out.println(de + " Record updated :");
		}catch(ClassNotFoundException | SQLException q) {
			q.printStackTrace();
		}
	}

}
