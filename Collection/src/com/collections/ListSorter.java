package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListSorter {

	public static List<Integer> sortIntList(List<Integer> inputList) {
		List<Integer> list = new ArrayList<>();
		list.add(147);
		list.add(36);
		list.add(73);
		list.add(90);
		list.add(21);
		list.add(238);
		Collections.sort(list);
		list.forEach(System.out::println);
		return list;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		System.out.println(sortIntList(list));
	}

}

