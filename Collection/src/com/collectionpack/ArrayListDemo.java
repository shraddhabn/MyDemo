//To add objects:
//add(Object o);-----Collection
//add(int index,Object o);-----List
//addElement(Object o);-----Vector

//To remove elements:
//remove(Object o);--------Collection
//remove(int index);--------------List
//removeElement(Object o);----Vector
//removeElementAt(int index);-----Vector
//removeAllElements();-----Vector
//clear();-------Collection

//To get objects:
//Object get(int index);---------------List
//Object elementAt(int index);-----Vector
//Object firstElement();--------------Vector
//Object lastElement();---------------Vector

//Other methods:
//Int size();//How many objects are added
//Int capacity();//Total capacity
//Enumeration elements();

//ArrayList:
//The underlying data structure is resizable array (or) growable array.
//Duplicate objects are allowed.
//Insertion order preserved.
//Heterogeneous objects are allowed.(except TreeSet , TreeMap every where heterogenious objects are allowed)
//Null insertion is possible.


package com.collectionpack;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		System.out.println(a); //[A, 10, A, null]
		a.remove(2);
		System.out.println(a); //[A, 10, null]
		a.add(2,"m");
		a.add("n");
		System.out.println(a); //[A, 10, m, null, n]
	}

}
