//package com.hafeez;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.context.annotation.Import;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.testcontainers.containers.BindMode;
//import org.testcontainers.containers.GenericContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import com.hafeez.entity.Animal;
//import com.hafeez.repo.AnimalRepo;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@Testcontainers
//@EnableAutoConfiguration(exclude = MongoAutoConfiguration.class)
//@MockBean(classes = {AnimalRepo.class})
//class AnimalMicroserviceApplicationTests {
//	
//	private static final String uri="mongodb://root:root@%s:%s/admin";
//	
//	@Autowired
//	AnimalRepo repo;
//	
//	@LocalServerPort
//	int port;
//	
//	@Autowired
//	TestRestTemplate template;
//
//	@Container
//	private static GenericContainer<?> mongo=new GenericContainer<>("mongo")
//		.withExposedPorts(27017)
//		.withEnv("MONGO_INITDB_ROOT_USERNAME","root")
//	.withEnv("MONGO_INITDB_ROOT_PASSWORD","root")
//	.withClasspathResourceMapping("init.js", "/docker-entrypoint-initdb.d/init.js", BindMode.READ_ONLY);
//	
//	@DynamicPropertySource
//	private static void connectOnRuntime(DynamicPropertyRegistry registry) {
//		mongo.start();
//		registry.add("spring.data.mongodb.uri", ()-> 
//		String.format(uri, mongo.getHost(),mongo.getMappedPort(27017)));
//	}
//	
//	@Test
//	void  testAllEmployees(){
////		repo.
//		
//		ResponseEntity<Animal> res=template.getForEntity("/animal/cat", Animal.class);
//		System.out.println(res.getBody());
//		Assert.assertNotNull(res.getBody());
//	}
//
//}
