package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class addstudent  {

	
	public void addStudent()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","KiranPatil@2001");
		
		PreparedStatement ps = co.prepareStatement("insert into student values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name");
		String name = sc.nextLine();
		System.out.println("Enter Student Education");
		String educ = sc.nextLine();
		System.out.println("Enter Student City");
		String city = sc.nextLine();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, educ);
		ps.setString(4, city);
		
		int i = ps.executeUpdate();
		if(i>0)
			System.out.println("Record Stored Successfully");
		else
			System.out.println("Record is Not Stored");
		
		co.close();
		
	}

}
