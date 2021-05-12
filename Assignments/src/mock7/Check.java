package mock7;

class Myclasss{ 

	static int add(int a,int b){ 

		return a+b; 

	} 

	static int add(int a,int b,int c){ 

		return a+b+c; 

	} 

}
class Check{ 

	public static void main(String[] args){ 

		System.out.println(Myclasss.add(10,20) ); 

		System.out.println(Myclasss.add(10, 20, 30)); 



	} 

} 