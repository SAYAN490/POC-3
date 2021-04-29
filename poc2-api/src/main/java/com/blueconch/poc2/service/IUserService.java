package com.blueconch.poc2.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueconch.poc2.dto.User;

@Repository
public interface IUserService extends CrudRepository<User,Long> {
	
	@Query("from User")

	List<User> getAllUser();

	

	
	

}
