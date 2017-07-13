package com.organically4u.service;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import com.mongodb.gridfs.GridFSDBFile;
import com.organically4u.model.Product;
import com.organically4u.model.dto.ProductDTO;

public interface ProductService {
	
	public List<ProductDTO> getAllProducts();
	public String addProduct(ProductDTO productDTO);
	public String deleteProduct(String id);
	
	//methods to get and store an image
	public String storeProductImage() throws FileNotFoundException;
	public GridFSDBFile retrieveProductImage() throws FileNotFoundException;
	
}
