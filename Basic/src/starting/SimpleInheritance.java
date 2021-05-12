package starting;

public class SimpleInheritance {

void greeting() {
	System.out.println("Hi");
}
}
class Child extends SimpleInheritance
{

public static void main(String[] args) {
		
	//System.out.println("Devil");
	SimpleInheritance s1=new SimpleInheritance();
	s1.greeting();
		
	}

}
