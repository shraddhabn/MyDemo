package starting;

public class RefVariable {

	int id;
	String name;

void insertRecord(int i, String n){  
	  id=i;  
	  name=n;  
	 }  
	 void displayInformation(){
		 System.out.println(id+" "+name);
		 }  
	}  
	
class Refvariable2{
	public static void main(String[] args) {
		RefVariable r1 =new RefVariable();
			r1.id=1;
			r1.name="devil";
			System.out.println(r1.id + "" + r1.name);
	}

}
