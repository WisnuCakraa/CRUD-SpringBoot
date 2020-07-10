package com.enigma.employee.dao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;

import com.enigma.employee.entity.EmployeeEntity;

public class EmployeeDAO {
	public Page<EmployeeEntity> getListForPagination(TableRequest tableRequest, HttpServletRequest httpReq){
		return null;
		
	}
	
	public EmployeeEntity getById(Integer id) {
		return null;
	}
	
	public EmployeeEntity insert(EmployeeEntity employeeEntity) {
		return employeeEntity;
	}
	
	public EmployeeEntity update(EmployeeEntity employeeEntity) {
		return employeeEntity;
		
	}
	
	public EmployeeEntity delete(EmployeeEntity employeeEntity) {
		return employeeEntity;
		
	}
}
