package asign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava?useSSL=false","root","password");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select avg(marks) from student");
			
			while(rs.next())
			{
				System.out.println("Averge marks are :- "+rs.getFloat(1));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Program Finished !");

	}

}
