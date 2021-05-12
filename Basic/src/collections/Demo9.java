package collections;

import java.util.LinkedList;

public class Demo9 {

	public static void main(String[] args) {
		LinkedList<String> l =new LinkedList<String>();
		
		l.add("B");
		l.add("c");
		l.add("d");
		l.add("r");
		l.addLast("r");
		l.addFirst("o");
		l.add(1,"B");
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println("After remove first and last : ");

		System.out.println(l);
		String st = l.get(0);
		System.out.println(st);
		System.out.println("After change : ");
		
		

	}

}
