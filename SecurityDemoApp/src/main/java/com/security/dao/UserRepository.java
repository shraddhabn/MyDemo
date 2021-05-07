package com.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

	User findByUsername(String username);
	
}
