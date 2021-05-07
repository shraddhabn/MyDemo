package com.job.dao;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDao extends JpaRepository<com.job.entity.User, Integer> {
	
}
