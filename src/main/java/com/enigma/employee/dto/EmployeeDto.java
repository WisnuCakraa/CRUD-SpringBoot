package com.enigma.employee.dto;

import java.util.List;

import com.enigma.employee.entity.EmployeeEntity;
import com.enigma.employee.entity.PositionEntity;

public class EmployeeDto {
	private EmployeeEntity employeeEntity;
	private List<PositionEntity> positionEntity;
	
	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}
	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}
	public List<PositionEntity> getPositionEntity() {
		return positionEntity;
	}
	public void setPositionEntity(List<PositionEntity> positionEntity) {
		this.positionEntity = positionEntity;
	}
	
	
}