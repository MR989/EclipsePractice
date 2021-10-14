package com.lti.appl.user;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.beans.Employee;
import com.lti.appl.services.EmpService;
import com.lti.appl.services.EmpServicesImpl;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		EmpService service  = context.getBean("empService",EmpServicesImpl.class);
		
//		gettign all records
//		List<Employee> clientList=service.getEmpList();
//		System.out.println(clientList);
//		
		
		
		
//		inserting new record
//		Employee e=new Employee("shivam",65000);
//		int empNo= service.addEmployee(e);
//		
//		System.out.println("Your r registered with "+empNo);
		
		
		//Reading a record using empdId
		Employee res= service.searchEmployee(2);
		System.out.println(res);
		
		//Update 
		
		
		//delete 
		int empId=service.deleteEmployee(2);
		System.out.println("Record Deleted for  "+empId);
		
	}

}
