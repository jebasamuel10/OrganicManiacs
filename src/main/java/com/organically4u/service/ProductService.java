package com.organically4u.service;

import java.util.List;

import com.organically4u.model.Product;
import com.organically4u.model.dto.ProductDTO;

public interface ProductService {
	
	public List<ProductDTO> getAllProducts();
	public String addProduct(ProductDTO productDTO);
	public String deleteProduct(String id);
	
}
