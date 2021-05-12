package collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer s1, StringBuffer s2) {
		
		String m1 =s1.toString();
		String m2 =s2.toString();
		return m1.compareTo(m2); //Asc
	}
	
}

public class Demo13 {

	public static void main(String[] args) {


		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>();
		t.add(new StringBuffer("Orange"));
		t.add(new StringBuffer("Mango"));
		t.add(new StringBuffer("Banana"));
		t.add(new StringBuffer("Apple"));
		t.add(new StringBuffer("Lemon"));
		
		
		t.forEach(x-> System.out.println(x));

	}

}
