//key and value pair 
//key= no duplicate
//value= duplicate
package com.collectionpack;

import java.util.HashMap;

public class MapDemo {


	public static void main(String[] args) 
	{
		HashMap m=new HashMap();
		m.put("100","vijay");
		System.out.println(m);//{100=vijay}
		
		m.put("100","ashok");
		System.out.println(m);//{100=ashok}
		
		m.put("100","devil");
		System.out.println(m);//{100=ashok}
	}
}
