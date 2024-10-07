package com.jdbc;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		
		addstudent s = new addstudent();
		showrecords s1 = new showrecords();
		deletestudent d2 = new deletestudent();
		updatestudent up = new updatestudent();
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Welcome to the Project: ");
			System.out.println("1.Add Student\n2.Show Records\n3.Delete Student\n4.Update Student");
			System.out.println("Please Enter the Options");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				s.addStudent();
				break;
			case 2:
				s1.showRecord();
				break;
			case 3:
				d2.deleteStudent();
				break;
			case 4:
				up.updateStudent();
				break;
			default:
				System.out.println("the options is not available yet");
			}
		
		
		}catch(Exception e) {
			System.out.println("something is wrong "+e.getMessage());
		}
		

	}

}
