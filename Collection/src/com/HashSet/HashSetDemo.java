package com.HashSet;

import java.util.HashSet;

public class HashSetDemo {


	public static void main(String args[]) {

		HashSet<String> hset = new HashSet<String>();

		//adding
		hset.add("Java");

		hset.add("Oops");

		hset.add("C");

		hset.add("C++");

		hset.add("Python");
		
		System.out.println(hset);

		//duplicate values

		hset.add("Python");

		System.out.println(hset);


		//null value
		hset.add(null);

		System.out.println(hset);

		hset.add("DAA");

		System.out.println(hset);

		//double null value not accept
		//null value
		hset.add(null);

		System.out.println("dddddd");

		System.out.println(hset);

		//size


		System.out.println(hset.size());

		//null value
		hset.add(null);

		//empty or not

		System.out.println(hset.isEmpty());
	}
}
