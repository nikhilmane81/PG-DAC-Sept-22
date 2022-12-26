package asign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Que01 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava?useSSL=false","root","password");
			Statement s = con.createStatement();
			boolean flag = s.execute("CREATE TABLE student1 (rno int primary key, name varchar(50), marks float, DOB date)");
			
			s.close();
			con.close();	
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
