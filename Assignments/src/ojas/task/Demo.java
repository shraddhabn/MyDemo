package ojas.task;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeDetails {

	private Map<Integer, String> employeeIdNameMap;

	public EmployeeDetails() {
		employeeIdNameMap = new TreeMap<Integer,String>();
	}

	public EmployeeDetails(Map<Integer,String> employeeIdNameMap) {
		this.employeeIdNameMap =employeeIdNameMap;
	}
	public String getemployeeIdName(int employeeId) {
		String str ="";
		int count = 0;
		if(employeeIdNameMap ==null || employeeIdNameMap.size() ==0) {
			return null;
		}
		else {
			if(employeeIdNameMap.containsKey(employeeId)) {
				str = employeeIdNameMap.get(employeeId);
			}
		}
		if(str.length()==0) {
			return null;
		}else {
			return str;
		}
	}
	public Map<Integer,String> getemployeeIdNameMap(){
		return employeeIdNameMap;
	}

	public void setemployeeIdNameMap(Map<Integer,String>employeeIdNameMap) {
		this.employeeIdNameMap =employeeIdNameMap;
	}
}

public class Demo{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);


		int num1 =sc.nextInt();

		for(int i= 0 ; i< num1 ;i++) {
			System.out.println("Enter key and Value");
			m.put(sc.nextInt(),sc.next());
		}
		EmployeeDetails emp = new EmployeeDetails(m);
		System.out.println("Enter key to Search");
		System.out.println(emp.getemployeeIdName(sc.nextInt()));
	}

}
