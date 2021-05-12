package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		String strArray[] = {"Ramu","Sita","vani"};
		Collections.addAll(al,strArray);
		al.forEach(System.out::println);
		
	}

}
