package com.ojas;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMyEmp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("MyBean.xml"); 
		
		MyEmp emp = (MyEmp)context.getBean("MyEmpBean");
		
		System.out.println(emp);
		
	}

}
