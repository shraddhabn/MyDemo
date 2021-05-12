package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
	
		String strArray[] = {"Ramu","Sita","vani"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strArray));
		
		Object b[]=al.toArray();
		for(Object x:b) {
			System.out.println(x);
		}

	}

}
