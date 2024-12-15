package com.project.ticketTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ticketTracker.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	
	

}
