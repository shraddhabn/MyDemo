package ojas.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static List<Integer> sortIntList(List<Integer> inputList){
			List<Integer> list = new ArrayList<>();
			list.add(355);
			list.add(55);
			list.add(225);
			list.add(35);
			list.add(93);
			
			Collections.sort(list);
			list.forEach(System.out::println);
			
			return list;
		}
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			System.out.println(sortIntList(list));
	}

}
