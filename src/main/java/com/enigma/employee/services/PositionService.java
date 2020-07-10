package com.enigma.employee.services;

import java.util.List;

import com.enigma.employee.dao.PositionDAO;
import com.enigma.employee.entity.PositionEntity;

public class PositionService {
	public PositionDAO positionDAO;
	
	public PositionDAO getDAO() {
		return positionDAO;
	}
	
	public List<PositionEntity> getList(){
		return null;
	}
}
