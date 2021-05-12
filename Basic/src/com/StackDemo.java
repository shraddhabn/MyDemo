package com;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {		
       String reverse="";
		Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.print("Enter string");
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            reverse = reverse+stack.pop();
        }
        
        if(str.equals(reverse)) {
        	System.out.println("palindrome");
        }
        else{
        	System.out.println("Not palindrome");
        }
	}

}
