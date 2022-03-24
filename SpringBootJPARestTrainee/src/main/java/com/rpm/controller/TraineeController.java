package com.rpm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpm.entity.Trainee;
import com.rpm.service.TraineeService;

@RestController
@RequestMapping("/trainee") //  http://localhost:8625/trainee
public class TraineeController {
	
		
		@Autowired
		TraineeService service;
		
		//post-->insert,get-->get, put--->update and delete--->remove
		
		@PostMapping("/addTrainee")      // http://localhost:8625/trainee/addTrainee
		public Trainee addTrainee(@RequestBody Trainee tr) {
			
			return service.addTrainee(tr);
		}
		@PutMapping("/updateTrainee")     // http://localhost:8625/trainee/updateTrainee
		public Trainee updateTrainee(@RequestBody Trainee tr) {
			
			return service.updateTrainee(tr);
		}
		@GetMapping("/getTrainee/{tid}")   // http://localhost:8625/trainee/getTrainee/tid
		public Trainee getTrainee(@PathVariable("tid")  int trId) {
			
			return service.getTrainee(trId);
		}
		@GetMapping("/getAllTrainees")   // http://localhost:8625/trainee/getAllTrainees
		public List< Trainee> getAllTrainees() {
		
			return service.getAllTrainees();
			}
		@DeleteMapping("/deleteTrainee/{tid}") // http://localhost:8625/trainee/deleteTrainee/tid
		public String deleteTrainee(@PathVariable("tid")  int trId) {
			
			return service.deleteTrainee(trId);
		}
	}


