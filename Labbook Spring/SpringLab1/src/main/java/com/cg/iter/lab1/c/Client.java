package com.cg.iter.lab1.c;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring3.xml");
	Sbu sbu=context.getBean("sbu",Sbu.class);
	System.out.println("SBU Details");
	System.out.println("----------------------------");
	System.out.println("SBU Details");
	System.out.println("sbuCode: "+sbu.getSbuName());
	System.out.println("sbuHead : "+sbu.getSbuHead());
	System.out.println("sbuName : "+sbu.getSbuName());

	System.out.println("Employee Details:----------------");
	System.out.print("[");
	List<Employee> emp=sbu.getEmplist();
	for(Employee data:emp){
		System.out.print("Employee [");
		System.out.print("empId="+data.getEmpId()+", ");
		System.out.print("empName="+data.getEmpName()+", ");
		System.out.print("empSalary="+data.getSalary()+"]");
		if(emp.indexOf(data)!=emp.size()-1){
			System.out.println(",");
		}
	}
	System.out.print("]");
}
}
