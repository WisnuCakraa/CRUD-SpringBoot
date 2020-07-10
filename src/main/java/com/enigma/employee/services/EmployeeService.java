package com.enigma.employee.services;

import com.enigma.employee.dao.EmployeeDAO;

public class EmployeeService {
	public EmployeeDAO employeeDAO;
	
	public EmployeeDAO getDAO() {
		return employeeDAO;
	}
	
	
}
