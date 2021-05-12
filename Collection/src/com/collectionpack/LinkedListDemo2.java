//The underlying data structure is double LinkedList
//If our frequent operation is insertion (or) deletion in the middle then LinkedList is the best choice.
//If our frequent operation is retrieval operation then LinkedList is worst choice.
//Duplicate objects are allowed.
//Insertion order is preserved.
//Heterogeneous objects are allowed.
//Null insertion is possible.
//Implements Serializable and Cloneable interfaces but not RandomAccess.


package com.collectionpack;
import java.util.LinkedList;

public class LinkedListDemo2 {
	
		public static void main(String[] args) 
		{
			LinkedList l=new LinkedList();
			l.add("ashok");
			l.add(30);
			l.add(null);
			l.add("ashok");
			
			System.out.println(l); //[ashok, 30, null, ashok]
			l.set(0,"software");
			System.out.println(l); //[software, 30, null, ashok]
			l.set(0,"venky");
			System.out.println(l); //[venky, 30, null, ashok]
			l.removeLast();
			System.out.println(l); //[venky, 30, null]
			l.addFirst("vvv");
			System.out.println(l); //[vvv, venky, 30, null]
		}
	}
