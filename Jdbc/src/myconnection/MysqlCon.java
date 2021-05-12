package myconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MysqlCon {

	public static void main(String args[]){
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shraddha","root","root");
	
		Statement stmt=con.createStatement();
		 
		stmt = con.createStatement();
		
         stmt.execute("insert into customers values(133,'shi','hyd') ");
         
         System.out.println(stmt);
     
		}catch(Exception e){ System.out.println(e);}

		}
}
