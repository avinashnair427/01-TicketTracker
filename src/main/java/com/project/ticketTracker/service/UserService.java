package com.project.ticketTracker.service;

import com.project.ticketTracker.dto.RegistrationDto;
import com.project.ticketTracker.entity.User;

public interface UserService {

	void saveUser(RegistrationDto registrationDto);

	User findByEmail(String email);
}
