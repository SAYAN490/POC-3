package com.blueconch.poc2.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.blueconch.poc2.dto.Orders;

public interface IOrdersService extends CrudRepository<Orders,Long>{
	
	@Query("from Orders")

	List<Orders> getAllOrders();

}
