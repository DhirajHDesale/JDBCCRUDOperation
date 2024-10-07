package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletestudent {

	public void deleteStudent()throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cs = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","KiranPatil@2001");
		PreparedStatement ps = cs.prepareStatement("delete from student where id=?");
		System.out.println("Please Enter the ID of student");
		int id = sc.nextInt();
		ps.setInt(1, id);
		int i = ps.executeUpdate();
		if(i>0)
			System.out.println("Record Deleted Successfully");
		else
			System.out.println("No Data Found");
		
		cs.close();
		
	}

}
