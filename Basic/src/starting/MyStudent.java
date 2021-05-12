package starting;

public class MyStudent {

	int id;
	String sname;
	MyStudent(int i,String s){
		id= i;
		sname=s;}
	void info(){
		System.out.println(id +" "+ sname);}
	public static void main(String args[]){
		MyStudent stu = new MyStudent(1,"Shraddha");
		MyStudent stu1 = new MyStudent(2,"Pavani");
		stu.info();
		stu1.info();
	}
}



