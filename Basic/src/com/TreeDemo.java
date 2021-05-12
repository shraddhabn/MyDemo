package com;

import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("Bhanu");
		ts.add("Anu");
		
		//Exception in thread "main" java.lang.ClassCastException: 
		//ts.add(3);
		System.out.println(ts);
	}

}
