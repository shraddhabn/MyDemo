package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{	
	int empNo;
	String ename;
	double salay;

	@Override
	public String toString() {
		return empNo + " " + ename + " " +  salay;
	}

	public Employee(int empNo, String ename, double salay) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salay = salay;
	}

		
}

class ListOperations{

	List<Employee> list;
	ListOperations(){
		list = new ArrayList<>();
	}
	void addEmployee(Employee e) {
		list.add(e);
		System.out.println("Added successfully");
	}
	void deleteEmployee(int num) {
		list.remove(--num);
		System.out.println("Deleted successfully");
	}
	void updateEmployee(int ind,Employee e) {
		list.set(--ind,e);
		System.out.println("Updated successfully");
	}
	
	void listEmployee(int ind,Employee e) {
		System.out.println("Employees info");
		for(Employee e1 : list) {
			System.out.println(e1.toString());
		}
	}
	public void listEmployee() {
		System.out.println("Employee info");
		for(Employee e : list) {
			System.out.println(e.toString());
		}
		
	}

	void menu() {
		String m = " Menu Driven Application \n ";
		m += "1.Add Employee \n";
		m += "2.Delete Employee \n";
		m += "3.Update Employee \n";
		m += "4.List Employee \n";
		m += "5.Exit \n";
		m += "Select any option? \n";
		System.out.println(m);
	}
	
	void accept() {
		System.out.println("Enter your no,name,salary ?");
	}
	
}

public class Collection4 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);		
		ListOperations obj = new ListOperations();
		for(;;) {
			obj.menu();
			int choice= sc.nextInt();
			switch(choice) {
			case 1 : 
				obj.accept();
				obj.addEmployee(new Employee (sc.nextInt(),sc.next(),sc.nextDouble()));
				break;
			case 2:
				System.out.println("Enter your choice to delete");
				obj.deleteEmployee(sc.nextInt());
				break;
			case 3 : 
				obj.accept();
				int num = sc.nextInt();
				obj.updateEmployee(num,new Employee (sc.nextInt(),sc.next(),sc.nextDouble()));
				break;
			case 4:
				System.out.println("Employee Info");
				obj.listEmployee();
				break;
			case 5:
				System.exit(0);
				break;
		     default:
		    	 System.out.println("Invalid Option");
			}
		}

		}

	

}
