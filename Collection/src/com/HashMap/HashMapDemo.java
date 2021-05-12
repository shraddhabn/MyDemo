package com.HashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer , String> hmap	= new HashMap<Integer , String>();
		
		//Adding Elements
		
		hmap.put(1, "Shraddha");
		hmap.put(4, "ffffffg"); // maintain insertion order
		hmap.put(2, "Sharu");
		hmap.put(3, "Prasad");
		System.out.println(hmap);
		
		//removing Elements
	  hmap.remove(1);
      System.out.println(hmap);
		
		//Display Size

		System.out.println(hmap.size());
		

	      /* Get values based on key*/
		  String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);
	      

	      /* Remove values based on key*/
	      hmap.remove(2);
	      System.out.println("Map key and values after removal:");

	      System.out.println(hmap);
	    

		
	}

}
