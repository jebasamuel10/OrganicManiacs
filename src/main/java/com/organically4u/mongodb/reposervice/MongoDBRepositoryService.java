package com.organically4u.mongodb.reposervice;

import java.util.List;

import com.organically4u.model.dto.ProductDTO;

public interface MongoDBRepositoryService {

	public ProductDTO create(ProductDTO product);
	public ProductDTO delete(String id);
	public List<ProductDTO> findAll();
	public ProductDTO findById(String id);
	public ProductDTO update(ProductDTO product);
	 
}
