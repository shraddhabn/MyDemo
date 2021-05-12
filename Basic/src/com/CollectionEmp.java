package com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionEmp implements Serializable{
	private int eno;
	private String name;  
	private   double salary;

	public CollectionEmp(int eno, String name, double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "CollectionEmp [eno=" + eno + ", name=" + name + ", salary=" + salary + ", getEno()=" + getEno()
		+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

 class EmployeeSort{
	public static void  main(String[] args) {

		List<Employee> li = new ArrayList<Employee>();
		li.add(new Employee(107,"Shraddha",70000));
		li.add(new Employee(103,"Prasad",75000));
		li.add(new Employee(106,"Sharu",66000));
		li.add(new Employee(102,"Shubhangi",66000));
		li.add(new Employee(109,"ravi",78000));
		
	li.stream().filter(x->x.getSalary() >20000).forEach(System.out::println);
		//li.stream().sorted(Comparator.comparing(Employe::getEname)).forEach(System.out::println));
		

	}
}

