package myconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shraddha","root","root");
			PreparedStatement pstmt=con.prepareStatement("delete from customers where id=?") ;
			
			pstmt.setInt(1,101);  
		    int i=pstmt.executeUpdate();  
			System.out.println(i+" records deleted");  
			 con.close();  
			 
		}catch(Exception e){ 
			System.out.println(e);
			}

		
		}
	}
