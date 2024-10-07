package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class showrecords {

	public void showRecord()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","KiranPatil@2001");
		
		PreparedStatement ps = co.prepareStatement("select * from student");
	ResultSet rs = ps.executeQuery();
	
	boolean record = false;
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		record = true;
	}
	if(record==false)
		System.out.println("No Records Are Available");
	co.close();
	
	
	}
}
