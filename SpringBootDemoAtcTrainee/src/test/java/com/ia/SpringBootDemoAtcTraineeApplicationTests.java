package com.ia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.entity.Trainee;
import com.ia.service.TraineeService;

@SpringBootTest
class SpringBootDemoAtcTraineeApplicationTests {
	@Autowired
	TraineeService service;

	@Test
	void testAddTrainee() {
		Trainee trainee = new Trainee(111,"mehul","delhi");
		
		Trainee tr = service.addTrainee(trainee);
		
		assertEquals(tr.getTrName(), "mehul");
	}

}
