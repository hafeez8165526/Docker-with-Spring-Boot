//package com.hafeez;
//
//import org.json.JSONException;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.testcontainers.containers.BindMode;
//import org.testcontainers.containers.GenericContainer;
//import org.testcontainers.containers.wait.strategy.Wait;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.utility.DockerImageName;
//
//import com.hafeez.entity.employee;
//import com.hafeez.repo.employeeRepo;
//
//@Testcontainers
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class EmployeeMicroserviceTest {
//
//	@Autowired
//	employeeRepo repo;
//
//	@LocalServerPort
//	private int port;
//
//	@Autowired
//	TestRestTemplate restTemplate;
//
//	private static final int MONGO_PORT = 27017;
//	private static final String MONGO_INITDB_ROOT_USERNAME = "root";
//	private static final String MONGO_INITDB_ROOT_PASSWORD = "root";
//
//	private static final String MONGO_URI = "mongodb://root:root@%s:%s/admin";
//
//	private static final String INIT_JS = "/docker-entrypoint-initdb.d/init.js";
//
//	@Container
//	private static final GenericContainer<?> mongo = new GenericContainer(DockerImageName.parse("mongo"))
//			.withExposedPorts(MONGO_PORT).withEnv("MONGO_INITDB_ROOT_USERNAME", MONGO_INITDB_ROOT_USERNAME)
//			.withEnv("MONGO_INITDB_ROOT_PASSWORD", MONGO_INITDB_ROOT_PASSWORD)
//			.withClasspathResourceMapping("init.js", INIT_JS, BindMode.READ_ONLY).waitingFor(Wait.forListeningPort());
//
//	@DynamicPropertySource
//	static void mongoProperties(DynamicPropertyRegistry registry) {
//		mongo.start();
//		registry.add("spring.data.mongodb.uri",
//				() -> String.format(MONGO_URI, mongo.getHost(), mongo.getMappedPort(MONGO_PORT)));
//
//	}
//
//	@Test
//	public void testAllEmployees() throws JSONException, InterruptedException {
//		ResponseEntity<employee> response = restTemplate.getForEntity("/employee/hageez", employee.class);
//		Assert.assertNotNull(response.getBody());
//	}
//
//}
