package com.Ojas;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		System.out.println("Enter any value");
		Scanner sc = new Scanner(System.in);
		
		try {
			int a =sc.nextInt();
			
			System.out.println("a = " + a);
			
			int b =42/a;
			
			int c[] = {1};
			
			c[43] = 99;
		}
		
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		
        catch(ArrayIndexOutOfBoundsException e) {
			
		e.printStackTrace();
		}
		
		finally {
			System.out.println("Welcome");
		}
	}

}
