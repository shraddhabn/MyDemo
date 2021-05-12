package newmyconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {
		try{
			//register deriver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//create con
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shraddha","root","root");

			
			PreparedStatement pstmt=con.prepareStatement("delete from emp where id=?") ;

			pstmt.setInt(1,2);  
			int i=pstmt.executeUpdate();  
			System.out.println(i+" records deleted");  

			//close con
			con.close();

		}catch(Exception e){ System.out.println(e);}

	}
}

