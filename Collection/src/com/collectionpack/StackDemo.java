//It is the child class of Vector.
//Whenever last in first out(LIFO) order required then we should go for Stack.
//Constructor:
//It contains only one constructor.
//
//Stack s= new Stack();
//Methods:
//Object push(Object o);
//To insert an object into the stack.
//Object pop();
//To remove and return top of the stack.
//Object peek();
//To return top of the stack without removal.
//boolean empty();
//Returns true if Stack is empty.
//Int search(Object o);
//Returns offset if the element is available otherwise returns "-1"

package com.collectionpack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack s=new Stack();

		s.push("10");
		s.push("20");
		s.push("30");
		s.push("40");
		s.push("50");

		System.out.println(s);//[A, B, C]

		System.out.println(s.search("10"));
		
		System.out.println(s.pop());

		System.out.println(s);

		System.out.println(s.peek());

		System.out.println(s);
		
		System.out.println(s.search("10"));

		System.out.println(s.search("20"));
		
		System.out.println(s.search("30"));
		
		System.out.println(s.search("40"));

		System.out.println(s.empty()); //false
	}

}
