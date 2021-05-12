package starting;

public class MainInOtherClass {

	int id;
	String name;
}
class SecondClass {

	public static void main(String[] args) {

		MainInOtherClass s1=new MainInOtherClass();  
		s1.id=2;
		s1.name="devil";
		System.out.println(s1.id);  
	    System.out.println(s1.name);  
	}

}
