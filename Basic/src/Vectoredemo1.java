import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Vectoredemo1 {

	public Vector<Integer> dispEvenNos(int startValue,int endValue){
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i = startValue;i<=endValue;i++) {
			if(i%2 == 0) {
				v.addElement(i);
			}
		}
		return v;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers Start,end");
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		Vectoredemo1 obj = new Vectoredemo1();
		Vector<Integer> v = obj.dispEvenNos(s, e);
		
		Enumeration<Integer> el =v.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}
}
