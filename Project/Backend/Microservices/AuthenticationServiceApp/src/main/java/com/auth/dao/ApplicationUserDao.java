package com.auth.dao;

import org.springframework.data.repository.CrudRepository;

import com.auth.models.ApplicationUser;

public interface ApplicationUserDao extends CrudRepository<ApplicationUser, Integer> {

	public ApplicationUser findByUsername(String username);
}
