package ojas.task;
import java.util.Date;  
import java.text.SimpleDateFormat;  
import java.text.ParseException;  

public class CompareDate {

	public static void main(String[] args) throws ParseException   
	{  
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		
		Date date1 = sdf.parse("2011-03-20");  
		Date date2 = sdf.parse("2021-04-24");  
	 
		System.out.println("Date 1: " + sdf.format(date1));  
		System.out.println("Date 2: " + sdf.format(date2));  
	
		if(date1.compareTo(date2) > 0)   
		{  
			System.out.println("Date 1 comes after Date 2");  
		}   
		else if(date1.compareTo(date2) < 0)   
		{  
			System.out.println("Date 1 comes before Date 2");  
		}   
		else if(date1.compareTo(date2) == 0)   
		{  
			System.out.println("Both dates are equal");  
		}  
	}  
}  

