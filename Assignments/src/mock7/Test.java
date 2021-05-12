package mock7;

class Test {
	
		int x;
		int y;
		void add(int a) {
		x = a + 1;
		}
		void add(int a, int b) {
		x = a + 2;
		}
		public static void main(String[] args) {
		Test obj = new Test();
		int a = 0;
		obj.add(6);
		System.out.println(obj.x);
		}}


