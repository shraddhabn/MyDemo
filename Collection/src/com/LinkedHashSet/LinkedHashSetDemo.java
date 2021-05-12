package com.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhset= new LinkedHashSet<String>();
		
		//LinkedHashSet<Integer> lhset1= new LinkedHashSet<Integer>();
		
		
		//add
		lhset.add("Pune");
		lhset.add("Solapur");
		System.out.println(lhset);
		
		//remove
		lhset.remove("Pune");

		System.out.println(lhset);
	}

}
