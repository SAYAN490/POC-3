package com.blueconch.poc2.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueconch.poc2.dto.Address;

@Repository
public interface IAddressService extends CrudRepository<Address,Long> {

	@Query("from Address")
	public List<Address> getAllAddress();

}
