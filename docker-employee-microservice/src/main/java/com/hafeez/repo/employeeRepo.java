package com.hafeez.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hafeez.entity.employee;

@Repository
public interface employeeRepo extends MongoRepository<employee, String>{
	public employee findByName(String name);
}
