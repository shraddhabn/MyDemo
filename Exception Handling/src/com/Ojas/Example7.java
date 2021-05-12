package com.Ojas;
import java.util.Scanner;
public class Example7 {
public static void main(String[] args) {
			
			System.out.println("Welcome");
			
			System.out.println("Enter any value");
			Scanner sc = new Scanner(System.in);
			
			try {
				int[] arr=new int[5];
				String s=null;
				System.out.println(s.length());
			}
			
			
	
			
			catch(ArithmeticException e) {
				
				System.out.println(e);
			}
			
catch(Exception e) {
				
				System.out.println(e.getMessage());  //e.getMessage used to give message 
			}
			
			
			
			finally {
				System.out.println("Welcome");
			}
		}

	}


