package asign;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import java.util.Scanner;


public class Que11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number");
		int rno = sc.nextInt();
		System.out.println("Enter name of Student");
		String name = sc.next();
		System.out.println("Enter Marks of Student out of 100");
		float marks = sc.nextFloat();
		System.out.println("Enter data of exam");
		String date = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webjava?useSSL=false","root","password");
			CallableStatement s = con.prepareCall("{ call insertData(?,?,?,?) }");
			s.setInt(1, rno);
			s.setString(2, name);
			s.setFloat(3, marks);
			s.setString(4, date);
			int i = s.executeUpdate();
			
			System.out.println(i+" rows deleted");
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}

}
