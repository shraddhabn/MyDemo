package newmyconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDataInDataBase {

	public static void main(String[] args) {
		try {
			//1.reg driver

			Class.forName("com.mysql.cj.jdbc.Driver");

			//2.create con
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shraddha","root","root");

			//3.create Statement 
			Statement stmt=con.createStatement();

			//4.execute query

			stmt.execute("insert into emp values(6,'ramu','madhapur',31)");
			System.out.println(stmt);
		
			//5.close con
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
