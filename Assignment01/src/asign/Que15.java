package asign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Que15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city");
		String city = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava?useSSL=false", "root",
					"password");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from employee join address on "
					+ "employee.empid = address.empid "
					+ "where address.city="+"'"+city+"'");
			if(rs.next())
			{
				rs.beforeFirst();
			while (rs.next()) {
	
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7));
			}
			}
			else {
				System.out.println("No result found");
			}

			s.close();
			con.close();
			sc.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
