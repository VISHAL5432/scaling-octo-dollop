package com.faltoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2jdbc {

	public static void main(String[] args) {
		 Connection con = null;
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Boys","root","6553");
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery("select * from boy1");
			 
			 while(rs.next()) {
				 System.out.println(rs.getInt("sid") + " "+ rs.getString("s_name")+" "+rs.getString("s_depatment")+" "+ rs.getString("s_sub")+" "+rs.getInt("s_age")+" "+rs.getString("s_email")+" "+rs.getDouble("s_salary"));
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 try {
				 con.close();
			 }catch (SQLException e) {
				 e.printStackTrace();
			 }
		 }
	}

}
