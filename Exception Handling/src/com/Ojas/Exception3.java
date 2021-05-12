package com.Ojas;

public class Exception3 {

	public static void main(String[] args) {
		
		String direction[]= {"east","west","north","south"};
		System.out.println("Hello");
		
	try {
		
		//System.exit(0);
			System.out.println(direction[4]);
		 
			System.out.println("hello2");
		}
		catch(ArithmeticException e) {

			
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Welcome Finally");
		}
		
	}

}
