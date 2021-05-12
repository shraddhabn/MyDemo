//The underlying data structure is resizable array (or) growable array.
//Duplicate objects are allowed.
//Insertion order is preserved.
//Heterogeneous objects are allowed.
//Null insertion is possible.
//Implements Serializable, Cloneable and RandomAccess interfaces.
//Every method present in Vector is synchronized and hence Vector is Thread safe.

package com.collectionpack;

import java.util.Vector;

public class VectorDemo {


	public static void main(String[] args) 
	{
		Vector v=new Vector();
		System.out.println(v.capacity());   //10
		
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
	System.out.println(v.capacity());   //10

	v.addElement("A");
	
	System.out.println(v.capacity());    //20
	
	System.out.println(v);      //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
	}
	
}
