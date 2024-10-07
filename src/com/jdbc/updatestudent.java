package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updatestudent {
public void updateStudent()throws Exception {
	Scanner sc = new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","KiranPatil@2001");
	
PreparedStatement ps = co.prepareStatement("update student set name=? , city=? where id=?");
System.out.println("Enter the Student Id to Update");
int id  = sc.nextInt();

sc.nextLine();
System.out.println("Enter the Student Name to Update");
String name = sc.nextLine();

System.out.println("Enter the Student city to update");
String city = sc.nextLine();

ps.setString(1, name);
ps.setString(2, city);
ps.setInt(3, id);


int i = ps.executeUpdate();
if(i>0)
	System.out.println("Record Updated Successfully");
else
	System.out.println("Record Not Updated");

co.close();

}
}
