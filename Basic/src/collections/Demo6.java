package collections;

import java.util.ArrayList;

import collections.MyEmployee.MyStudent;

class MyEmployee{
	int empNo;
	String ename;
	public MyEmployee(int empNo, String ename) {
		super();
		this.empNo = empNo;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "MyEmployee [empNo=" + empNo + ", ename=" + ename + "]";
	}
	
	
	
	class MyStudent{
		
		int sno;
		 String sname;
		public MyStudent(int sno, String sname) {
			super();
			this.sno = sno;
			this.sname = sname;
		}
		@Override
		public String toString() {
			return "Mystudent [sno=" + sno + ", sname=" + sname + "]";
		}
		 
		 
		 
	}
}
public class Demo6 {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		
		list.add(new MyEmployee(10,"shraddha"));
		list.add(new MyEmployee(11,"Prasad"));
		list.add(new MyEmployee(12,"Rau"));
		
		//list.add(new MyStudent(1,"Pavani"));
		
		
//		list.add(new MyStudent(1,"Pavani"));
//		list.add(new Mystudent(3,"Mayuri"));
//		list.add(new Mystudent(2,"Shivani"));
		
		list.add("Phani");
		Object b[] = list.toArray();
		for(Object x: b) {
			if(x instanceof MyStudent) {
				MyStudent e = (MyStudent)x;
				System.out.println("MyStudent info");
				
			}
		}
		
	}

}
