package mock7;

public class Tester {

	public static void main(String[] args) {
		String a = "rooman";
		String b = "rooman";
		String c = new String("rooman");
		System.out.print(a==b);
		System.out.print(a==c);
		System.out.print(b.equals(c));
		System.out.print(b.equals(a));
	}
}

