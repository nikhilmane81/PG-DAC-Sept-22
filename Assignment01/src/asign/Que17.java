package asign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Que17 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava?useSSL=false", "root",
					"password");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from employee where year(joindate) <= year(curdate())-5");
			if(rs.next())
			{
				rs.beforeFirst();
			while (rs.next()) {
	
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
			}
			}
			else {
				System.out.println("No result found");
			}

			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
