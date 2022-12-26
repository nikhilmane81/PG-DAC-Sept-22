package asign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Que2 {

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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava?useSSL=false","root","password");
			PreparedStatement ps = con.prepareStatement("INSERT INTO student1 values (?,?,?,?)");
			ps.setInt(1, rno);
			ps.setString(2, name);
			ps.setFloat(3, marks);
			ps.setString(4, date);
			int i = ps.executeUpdate();
			ps.close();
			con.close();
			sc.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Program Finished !");

	}

}
