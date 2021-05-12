package com.arraylists;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("shraddha");
		str.add("prasad");
		str.add("jhon");
		str.add("Jon");
		str.add("mike");
		
		for(String s : str)
		{
			System.out.println(s);
		}
	}

}
