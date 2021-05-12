package com.arraylists;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		
		list.add(33);
		list.add(44);
		list.add(66);
		list.add(88);
		
		for(int i : list) {
			System.out.println(i);
		}
		
	}
		
	

}
