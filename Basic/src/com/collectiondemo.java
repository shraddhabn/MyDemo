package com;

import java.util.HashSet;

public class collectiondemo {

	public static void main(String[] args) {
	
		HashSet<String> h = new HashSet<String>();
		h.add("C");
		h.add("D");
		System.out.println(h.add("D"));
		System.out.println(h.add("D"));
		System.out.println(h);
	}

}
