package com.hafeez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hafeez.client.EmpAppProxy;
import com.hafeez.dto.employee;
import com.hafeez.entity.Animal;
import com.hafeez.repo.AnimalRepo;
import com.hafeez.util.AppUtil;

@RestController
public class AnimalController {
	
	@Autowired
	private AnimalRepo repo;
	
	
	@Autowired
	EmpAppProxy proxy;
	
	@GetMapping("/animal/all")
	public List<Animal> getAll() {
		System.out.println("=======Hostname:"+AppUtil.getHostName());
		return repo.findAll();
		
	}
	
	@GetMapping("/animal/{name}")
	public Animal getOne(@PathVariable String name) {
		return repo.findByName(name);
		
	}
	
	@PostMapping("/animal")
	public Animal add(@RequestBody Animal e) {
		return repo.save(e);
		
	}
	@GetMapping("/animal/emp/{name}")
	public String getAnimalFoodItems(@PathVariable String name)  {
//		try {
//			ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//			AnimalFoodResponse resutl=mapper.readValue(res,AnimalFoodResponse.class);
//			return resutl;
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return proxy.getEmployessHavingAnimal(name);
	}
	
	
}
