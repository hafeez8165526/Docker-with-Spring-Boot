package com.hafeez.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hafeez.entity.Animal;

@Repository
public interface AnimalRepo extends MongoRepository<Animal, String>{
	public Animal findByName(String name);
}
