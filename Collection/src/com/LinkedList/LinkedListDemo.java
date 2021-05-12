package com.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		
		linkedlist.add("shraddha");
		linkedlist.add("prasad");
		linkedlist.add("Jon");
		linkedlist.add("mike");
		linkedlist.add("Devil");
		linkedlist.add("Cassie");
		linkedlist.add("Suzy");
		
		System.out.println("Before Remove Elements");

		System.out.println(" ");
		
		for(String s : linkedlist) {
			System.out.println(s);
		}
		

		System.out.println(" ");
		linkedlist.remove(3);

		
		System.out.println("After Remove Elements");
		
		for(String s : linkedlist) {
			System.out.println(s);
		}
		

		System.out.println(" ");
		linkedlist.set(0,"Sharu");
			for(String s : linkedlist) {
			System.out.println(s);
			}	
			System.out.println("Size of ArrayList is " + linkedlist.size());	
		
			/*Add First and Last Element*/
		       linkedlist.addFirst("First Item");
		       linkedlist.addLast("Last Item");
		       System.out.println("LinkedList Content after addition: " +linkedlist);

		       /*This is how to get and set Values*/
		       Object firstvar = linkedlist.get(0);
		       System.out.println("First element: " +firstvar);
		       linkedlist.set(0, "Changed first item");
		       Object firstvar2 = linkedlist.get(0);
		       System.out.println("First element after update by set method: " +firstvar2);

		       /*Remove first and last element*/
		       linkedlist.removeFirst();
		       linkedlist.removeLast();
		       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

		       /* Add to a Position and remove from a position*/
		       linkedlist.add(0, "Newly added item");
		       linkedlist.remove(2);
		       System.out.println("Final Content: " +linkedlist); 
			
	}

}
