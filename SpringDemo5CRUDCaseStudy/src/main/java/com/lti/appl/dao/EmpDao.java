package com.lti.appl.dao;

import java.util.List;

import com.lti.appl.beans.Employee;

public interface EmpDao {
	
	public abstract List<Employee> getEmpList();
	
	public abstract int  addEmployee(Employee e );
	
	public abstract Employee searchEmployee(int empId);
	
	public abstract int  deleteEmployee(int empId);

}
