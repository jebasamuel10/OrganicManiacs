package com.organically4u.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.mongodb.gridfs.GridFSDBFile;
import com.organically4u.model.Product;
import com.organically4u.model.dto.CategoryDTO;
import com.organically4u.model.dto.ProductDTO;

public interface ProductService {
	
	//Posting - Admin -start
	public String addProduct(ProductDTO productDTO);
	public String updateProductDetails(ProductDTO productDTO);
	public String deleteProduct(String id);
	
	public String addCategory(CategoryDTO categoryDTO);
	public String deleteCategory(String id);
	public String updateCategory(String id);
	
	public String addSourceFrom(ProductDTO productDTO);
	public String delteSourceFrom(String id);
	public String updateSourceFrom(String id);
	
	public String addCustomer(ProductDTO productDTO);
	public String delteCustomer(String id);
	public String updateCustomer(String id);
	
	//Posting - Admin - End

	
	public List<ProductDTO> getAllProducts();
	public List<String> getAllProductName();
	public List<CategoryDTO> getAllCategories();
	public List<String> getAllCategoryName();
	public List<ProductDTO> getAllSrcfroms();
	
	public Product getProduct(String id);
	public ProductDTO getSrcfrom();
	public ProductDTO getCategories();
	
	
	//methods to get and store an image
	public String storeProductImage() throws FileNotFoundException;
	public GridFSDBFile retrieveProductImage() throws FileNotFoundException;
	
}
