package com.job.dao;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;



public interface JobDao extends JpaRepository<com.job.entity.Job, Integer> {

	public List<com.job.entity.Job> findByJobType(String jobType);
	
//	public List<Job> findByJobexp(int experience);
	
	public List<com.job.entity.Job> findByCountry(String country);
	
	public List<com.job.entity.Job> findByAvailability(String availability);

	



}
