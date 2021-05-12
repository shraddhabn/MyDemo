package com.arraylists;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> str=new ArrayList<String>();
		
		str.add("shraddha");
		str.add("prasad");
		str.add("jhon");
		str.add("Jon");
		str.add("mike");
		str.add("Devil");
		str.add("Cassie");
		str.add("Suzy");
		
		System.out.println("Before Remove Elements");

		System.out.println(" ");
		
		for(String s : str) {
			System.out.println(s);
		}
		

		System.out.println(" ");
		str.remove(3);

		
		System.out.println("After Remove Elements");
		
		for(String s : str) {
			System.out.println(s);
		}
		

		System.out.println(" ");
		str.set(0,"Sharu");
			for(String s : str) {
			System.out.println(s);
			}	
			System.out.println("Size of ArrayList is " + str.size());	
		
		
	}

}

//add(int index, String E), this method adds the specified element at the specified index, index 0 indicates first position and 1 indicates second position.
