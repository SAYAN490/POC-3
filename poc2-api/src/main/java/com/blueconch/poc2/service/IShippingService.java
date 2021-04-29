package com.blueconch.poc2.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueconch.poc2.dto.Address;
import com.blueconch.poc2.dto.Shipping;
@Repository
public interface IShippingService extends CrudRepository<Shipping,Long> {
	
	@Query("from Shipping")

	List<Shipping> getAllShipping();

}
