package com.lti.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.beans.Employee;


@Repository
public class EmpDaoImpl implements EmpDao{
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public List<Employee> getEmpList(){
		System.out.println("Inside Dao");
		
		String sql="Select e from Employee e";
		Query qry=em.createQuery(sql);
		List<Employee > emplist=qry.getResultList();
		return emplist;
	}


	@Override
	@Transactional
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		em.persist(e);
		System.out.println("record added ");
		
		return e.getEmpNo();
	}


	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee res=em.find(Employee.class,empId );
		System.out.println("serach result...");
		return res;
	}


	@Override
	@Transactional
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee res=em.find(Employee.class,empId );
		em.remove(res);
		
		return empId;
	}
	
	
}
