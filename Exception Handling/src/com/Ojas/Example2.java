package com.Ojas;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println("1");
		
		try {
			return;	
		}
		catch(Exception e){
			System.out.println("2");
		}
		finally {
			System.out.println("3");
		}
		System.out.println("4");
		}

}
