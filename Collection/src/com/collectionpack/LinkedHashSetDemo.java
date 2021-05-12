//1) The underlying data structure is a combination of LinkedList and Hashtable.
//2) Insertion order is preserved.and duplicates are not allowed.

package com.collectionpack;
import java.util.*; 

public class LinkedHashSetDemo {	

	public static void main(String[] args) 
	{
		   LinkedHashSet<String> hs  = new LinkedHashSet<String>(); 

		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("Z");
		hs.add("null");
		hs.add("10");
		hs.add("null");//1 duplicate value allow
		hs.add("Z");
		/*
		 * System.out.println(hs.add("Z"));//false
		 */		
		System.out.println(hs);//[B, C, D, Z, null, 10]
		}


}
