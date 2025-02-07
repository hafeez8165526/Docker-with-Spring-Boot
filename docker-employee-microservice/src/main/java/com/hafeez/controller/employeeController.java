package com.hafeez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hafeez.entity.employee;
import com.hafeez.repo.employeeRepo;

@RestController
public class employeeController {
	
	@Autowired
	private employeeRepo repo;
	
	@GetMapping("/employee/all")
	public List<employee> getAll() {
		return repo.findAll();
		
	}
	
	@GetMapping("/employee/{name}")
	public employee getOne(@PathVariable String name) {
		return repo.findByName(name);
		
	}
	
	@PostMapping("/employee")
	public employee add(@RequestBody employee e) {
		return repo.save(e);
		
	}
	
	@GetMapping("/employee/search/{animal}")
	public String getEmployessHavingAnimal(@PathVariable String animal) {
		System.out.println("hai");
		if(animal.equalsIgnoreCase("cat")) {
			return "e1,e2";
		}else if(animal.equalsIgnoreCase("dog")) {
			return "e3,e4";
		}else {
			return "e5,e6";
		}
		
	}
	
	
}
