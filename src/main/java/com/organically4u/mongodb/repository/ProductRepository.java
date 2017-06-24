/*
 * Each collection at mongodb should have a repository Interface with different operations to be performed
 * in the mongo collection.
 */
package com.organically4u.mongodb.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.organically4u.model.Product;

public interface ProductRepository extends Repository<Product, String>{
	 	
		void delete(Product deleted);
	 
	    List<Product> findAll();
	 
	    Product findOne(String id);
	 
	    Product save(Product saved);
}
