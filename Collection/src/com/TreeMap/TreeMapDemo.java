//mentain insertion order

//use put() for insert instead of add()
package com.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer , String> tmap = new TreeMap();
		
		//adding
	 tmap.put(1,"Java");
     tmap.put(2,"C++");
	 tmap.put(3,"C");
	 tmap.put(0,"Ruby");
	 System.out.println(tmap);
	 
	 //remove
	 tmap.remove(2);

	 System.out.println(tmap);

	 

	 System.out.println(tmap.size());
	}

}
