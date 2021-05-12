package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDeno {

	public static void main(String[] args) {
		
		LinkedHashMap <Integer , String > lhmap = new LinkedHashMap();
		
		//add

		lhmap.put(0, "First");

		lhmap.put(1, "Second");

		lhmap.put(2, "Third");

		lhmap.put(3, "Four");

		lhmap.put(5, "Five");
		lhmap.put(6, "Six");
		System.out.println(lhmap);

		System.out.println(lhmap.size());
		
		//remove
		lhmap.remove(3);

		System.out.println(lhmap);
		

		System.out.println(lhmap.size());
		
		   // Generating a Set of entries
       // Set set = lhmap.entrySet();
        
        
	}

}
