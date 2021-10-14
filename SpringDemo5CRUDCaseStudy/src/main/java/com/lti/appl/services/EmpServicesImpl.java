package com.lti.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Employee;
import com.lti.appl.dao.EmpDao;

@Service("empService")
public class EmpServicesImpl implements EmpService {

	@Autowired
	EmpDao dao;
	
	public EmpDao getDao() {
		return dao;
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Employee> getEmpList() {
		
		System.out.println("Inside Service");
		
		List<Employee> empList=dao.getEmpList();
		
		return empList;
	}

	@Override
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.addEmployee(e);
		
	}

	@Override
	public Employee searchEmployee(int empId) {
		
		
		return dao.searchEmployee(empId);
	}

	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empId);
	}
}
