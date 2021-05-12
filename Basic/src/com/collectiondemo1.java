package com;

import java.util.HashSet;

public class collectiondemo1 {

	public static void main(String[] args) {


		HashSet<String> h = new HashSet<String>();
		
		h.add("C");
		System.out.println("Shraddha".hashCode());
		h.add("D");
		System.out.println("Shraddha");
		System.out.println("Prasad");
		System.out.println("Prasad".hashCode());
		System.out.println(h.add("D"));
		System.out.println(h.add("D"));
		System.out.println(h);
	}
}
