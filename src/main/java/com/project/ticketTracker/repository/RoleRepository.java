package com.project.ticketTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ticketTracker.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByName(String name);
}
