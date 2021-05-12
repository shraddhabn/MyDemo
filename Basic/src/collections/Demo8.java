package collections;
import java.util.ArrayList;
	import java.util.Collections;
import java.util.Comparator;
import java.util.List;

	class Employee2 {
		
		int empno;
		 String ename;
		public Employee2() {
			super();
		}
		public Employee2(int empno, String ename) {
			super();
			this.empno = empno;
			this.ename = ename;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		
		class MyComparator implements Comparator<Employee2>{
		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", ename=" + ename + "]";
		}
		
		}
		
		
		 
		
	}

	public class Demo8 {

		public static void main(String[] args) {
			
			List<Employee1> empList = new ArrayList<Employee1>();
			Employee1 e1 = new Employee1(10,"Harish");
			Employee1 e2 = new Employee1(1,"Bhanu");
			Employee1 e3 = new Employee1(3,"Chanu");
			Employee1 e4 = new Employee1(2,"Dhanu");
			Employee1 e5 = new Employee1(7,"Ranu");
			
			empList.add(e1);
			empList.add(e2);
			empList.add(e3);
			empList.add(e4);
			empList.add(e5);
			
			System.out.println("Before Sorting Employee Data");
			empList.forEach(x-> System.out.println(x.getEmpno() + "" + x.ename));
			
			Collections.sort(empList,new MyComparator());
			
			System.out.println("After Sorting Employee Data");
			empList.forEach(x-> System.out.println(x.getEmpno() + "" + x.ename));
			Collections.sort(empList);
			
		}

	}


