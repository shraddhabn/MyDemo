//Program describes that only unchecked exceptions are  propagated and  checked exceptions are not propagated 
package com.Ojas;

public class Example9 {
	
		  void m()
		  {  
		    int data=50/0;  
		  }  
		  
		  void n()
		  {  
		    m();  
		  }  
		  
		  void p()
		  {  
		    
			  try
			  {  
		        n();  
		      }
			  catch(Exception e)
			  {
				  System.out.println("exception handled");
			  }  
		  } 
		  
		  public static void main(String args[]){  
			  Example9 obj=new Example9();  
		       obj.p();  
		       System.out.println("normal flow...");  
		  }  
		}  


