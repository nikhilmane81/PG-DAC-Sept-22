package asign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Que5 {

	public static void main(String[] args) {
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava?useSSL=false","root","password");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("SELECT * from student1");
			while (rs.next()) {
				count = count+1;
			}
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total number of records are "+ count);
		System.out.println("Program Finished");

	}

}
