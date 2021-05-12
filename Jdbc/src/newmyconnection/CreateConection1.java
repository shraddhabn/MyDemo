// in jdbc program we need to add mysql-connector jar file

package newmyconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateConection1 {
	public static void main(String args[]) {

		try {
			//1.register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.create connection
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shraddha","root","root");

			 //3.create statement
			 Statement stmt=con.createStatement();
			 
			 //4.execute statement
			 ResultSet rs= stmt.executeQuery("select * from emp");
			 while(rs.next())  
					System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"   "+rs.getInt(4));  

			 
			 //5.close connection
			 con.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}

	}
}


