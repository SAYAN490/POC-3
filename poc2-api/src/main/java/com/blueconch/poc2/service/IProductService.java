package com.blueconch.poc2.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueconch.poc2.dto.Product;
@Repository
public interface IProductService extends CrudRepository<Product,Long> {

	@Query("from Product")
	List<Product> getAllProduct();
	
	/*Product getProductById(int prodId);
	void addProduct(Product product);
	void updateProduct(Product product, int prodId);
	void deleteProduct(int prodId);*/

}
