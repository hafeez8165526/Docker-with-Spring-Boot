package com.hafeez.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="employee-service",url = "${emp-service-url}")
public interface EmpAppProxy {
	
	@GetMapping("/search/{animal}")
	public String getEmployessHavingAnimal(@PathVariable("animal") String animal);

}
