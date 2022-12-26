package asign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Que12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employeeid integer only");
		int empid = sc.nextInt();
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter salary of Employee");
		int salary = sc.nextInt();
		System.out.println("Enter joining date of employee");
		String date = sc.next();
		System.out.println("Enter address id in integer");
		int addid = sc.nextInt();
		System.out.println("Enter city");
		String city = sc.next();
		System.out.println("Enter country");
		String country = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava?useSSL=false","root","password");
			PreparedStatement ps1 = con.prepareStatement("insert into employee values (?,?,?,?)");
			PreparedStatement ps2 = con.prepareStatement("insert into address values (?,?,?,?)");
			ps1.setInt(1, empid);
			ps1.setString(2, name);
			ps1.setInt(3, salary);
			ps1.setString(4, date);
			ps2.setInt(1, addid);
			ps2.setNString(2, city);
			ps2.setString(3, country);
			ps2.setInt(4, empid);
			int num1 = ps1.executeUpdate();
			int num2 = ps2.executeUpdate();
			ps1.close();
			ps2.close();
			con.close();
			sc.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Processed !");
	}

}
