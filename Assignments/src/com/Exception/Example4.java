package com.Exception;

public class Example4 {

	public static void main(String[] args) {

		try {
		System.out.println("This Statement Execute");
		Integer I = new Integer("abc");//thows exception

		System.out.println("This Statement not Execute");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finallyyyy");
		}
	}

}
