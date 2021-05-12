package mock3;

public class Test1 {
	static void go(int z){ 

		System.out.println("int"); 

		} 

		static void go(Object z){ 

		System.out.println("Object"); 

		} 

		static void go(Double z){ 

		System.out.println("Double"); 

		} 

		static void go(Number z){ 

		System.out.println("Number"); 

		} 

		public static void main(String... args) { 

		Integer i = 6; 

		go(i); 

		} 
}
