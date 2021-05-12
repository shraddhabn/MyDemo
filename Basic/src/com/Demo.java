package com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(70);
		list.add(10);
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
	}

}
