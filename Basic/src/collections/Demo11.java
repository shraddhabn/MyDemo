package collections;

import java.util.HashSet;

class Emp{
	int empNo;
	String ename;
	
	
	public Emp(int empNo, String ename) {
		super();
		this.empNo = empNo;
		this.ename = ename;
	}

	public int hashCode() {
		return this.empNo;
		
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", ename=" + ename + "]";
	}
	
	
}

public class Demo11 {

	public static void main(String[] args) {
		
		HashSet<Emp> wmpset = new HashSet<Emp>();
		Emp e1 = new Emp(10,"Shraddha");
		
		
	}

}
