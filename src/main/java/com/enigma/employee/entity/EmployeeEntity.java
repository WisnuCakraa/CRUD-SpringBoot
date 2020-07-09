package com.enigma.employee.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T2_EMPLOYEE")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date birth_date;
	private int position_id;
	private int id_number;
	private int gender;
	private int is_delete;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public int getPosition_id() {
		return position_id;
	}
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	public int getId_number() {
		return id_number;
	}
	public void setId_number(int id_number) {
		this.id_number = id_number;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}
	public EmployeeEntity(int id, String name, Date birth_date, int position_id, int id_number, int gender,
			int is_delete) {
		super();
		this.id = id;
		this.name = name;
		this.birth_date = birth_date;
		this.position_id = position_id;
		this.id_number = id_number;
		this.gender = gender;
		this.is_delete = is_delete;
	}
	public EmployeeEntity() {
		super();
	}
}