package collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
	
		return s1.compareTo(s2);
	}
	
}

public class Demo12 {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>();
		t.add("Orange");
		t.add("Mango");
		t.add("Banana");
		t.add("Apple");
		t.add("Lemon");
		
		t.forEach(x-> System.out.println(x));
	}

}
