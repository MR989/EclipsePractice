package com.lti.appl.services;

import java.util.List;

import com.lti.appl.beans.Employee;

public interface EmpService {
	
	public abstract List<Employee> getEmpList();
	
	public abstract int  addEmployee(Employee e );
	
	public abstract Employee searchEmployee(int empId);

	public abstract int  deleteEmployee(int empId);

}
