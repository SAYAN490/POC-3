package com.blueconch.poc2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueconch.poc2.dto.Shipping;

@Service
public class ShippingServiceImpl /*implements IShippingService*/{
	
	/*List<Shipping> shippingList= new ArrayList<> (Arrays.asList(
			new Shipping(1,"Post",56.0f,1),
			new Shipping(2,"Courier",356.3f,2)));*/
	
	@Autowired
	IShippingService shippingServiceRef1;

	
	public List<Shipping> getAllShipping() {
		// TODO Auto-generated method stub
		return shippingServiceRef1.getAllShipping();
	}

}
