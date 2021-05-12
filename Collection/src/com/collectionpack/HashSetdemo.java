//The underlying data structure is Hashtable.
//Insertion order is not preserved and it is based on hash code of the objects.
//Duplicate objects are not allowed.
//If we are trying to insert duplicate objects we won't get compile time error and runtime error add() method simply returns false.
//Heterogeneous objects are allowed.
//Null insertion is possible.(only once)
//Implements Serializable and Cloneable interfaces but not RandomAccess.
//HashSet is best suitable, if our frequent operation is "Search".

package com.collectionpack;

import java.util.HashSet;

public class HashSetdemo {

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		
		System.out.println(h);
		
		System.out.println(h.add("Z"));//false (duplicate values not allow)
		
		System.out.println(h);//[null, B, C, D, Z, 10]
		System.out.println(h.add("C"));
		System.out.println(h);
	}

}
