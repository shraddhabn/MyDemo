package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo3 {

	public static void main(String[] args) {
	
		
		String strArray[] = {"Ramu","Sita","vani"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strArray));
		al.forEach(System.out::println);
	}

}
