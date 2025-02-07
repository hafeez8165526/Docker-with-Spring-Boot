package com.hafeez.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hafeez.entity.employee;

@Service
public interface EmployeeService {
	public List<employee> getAll();
	public employee getOne(String name);
	public employee add( employee e);
	public List<employee> getEmployessHavingAnimal( String animal);

}
