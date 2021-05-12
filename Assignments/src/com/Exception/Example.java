package com.Exception;

public class Example {

	public static void main(String[] args) {
		try {
			Example obj =null;
			obj.disp();
		}
		catch(NullPointerException e) {
			System.out.println(" Memory is not Allowed");
		}
	}
		void disp() {
			System.out.println("WelCome");
		}
	}

