package com.job.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.job.entity.Job;
import com.job.entity.User;
import com.ojas.service.User_JobService;

@RestController
public class User_JobController {
	@Autowired
	private User_JobService service;
	
	@PostMapping("/user/createuser")
	public User cteateNewUser(@RequestBody User user) {
		return service.cteateNewUser(user);
	}
	
	@PostMapping("/job/postjob")
	public Job createNewJob(@RequestBody Job job) {
		return service.createNewJob(job);
	}
	
	//Get Job by ID
	@GetMapping("/job/getjob/{jobid}")
	public Optional<Job> getJobById(@PathVariable int jobid){
		return service.getJobById(jobid);
	}
	
	//get Job by Type
	@GetMapping("/job/getByType/{type}")
	public List<Job> getJobByType(@PathVariable String type){
		return service.getJobByType(type);
	}
	
	//Filter Job by Country:
	@GetMapping("/job/getByCountry/{country}")
	public List<Job> getJobBycountry(@PathVariable String country){
		return service.getJobBycountry(country);
	}
	
	//Filter Job by Availability
	@GetMapping("/job/getByAvailability/{availability}")
	public List<Job> getJobByavailability(@PathVariable String availability){
		return service.getJobByavailability(availability);
	}
	
	//-> Filter Job by Skills:
	
	
	@GetMapping("user/getalluser")
	public Iterable<User> getUser(@RequestBody User user){
		return service.getUser(user);
	}
}
