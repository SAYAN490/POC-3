package com.blueconch.poc2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueconch.poc2.dto.Product;


@Service
public class ProductServiceImpl{ /*implements IProductService 
	
	List<Product> prodList= new ArrayList<> (Arrays.asList(
			new Product(1,"Headphone","headphone.img",1,456),
			new Product(2,"Mobile","mobile.img",1,450)));*/
	@Autowired
	IProductService productServiceRef1;

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productServiceRef1.getAllProduct();
	}

	/*
	public Product getProductById(int prodId) {
		return prodList.stream().filter(e -> e.getProd_id() == prodId).findFirst().get();
	}

	
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		prodList.add(product);
		
	}

	@Override
	public void updateProduct(Product product, int prodId) {
		// TODO Auto-generated method stub
		for(int i=0; i<prodList.size();i++)
		{
			Product p=prodList.get(i);
			if(p.getProd_id()==prodId)
			{
				prodList.set(i, product);
				return;
			}
		}
		
	}

	@Override
	public void deleteProduct(int prodId) {
		// TODO Auto-generated method stub
		prodList.removeIf(e -> e.getProd_id() == prodId);
		
	}*/

}
