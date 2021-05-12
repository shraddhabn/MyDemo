
package com;
import java.util.ArrayList;
	import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

	public class Demo1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List<Integer> list = new ArrayList<>();
			list.add(10);
			list.add(30);
			list.add(20);
			list.add(50);
			list.add(70);
			list.add(10);
			
			Collections.sort(list,Collections.reverseOrder());
			Set<Integer> set = new HashSet<Integer>(list);
			list.forEach(System.out::println);
			
		}

	}

