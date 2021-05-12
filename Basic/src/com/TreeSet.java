package com;
 
public class TreeSet extends NameSorting{

	public static void main(String[] args) {
	
 TreeSet<String> ts = new TreeSet<String>();
 ts.add(" Ranu");
 ts.add(" eanu");
 ts.add(" fanu");
 ts.add(" danu");
 
 ts.forEach(System.out::println);
	}

}
