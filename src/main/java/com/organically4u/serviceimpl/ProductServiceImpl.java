package com.organically4u.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organically4u.model.Product;
import com.organically4u.model.dto.ProductDTO;
import com.organically4u.mongodb.reposervice.MongoDBRepositoryProductService;
import com.organically4u.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private MongoDBRepositoryProductService productRepo;
	
	
	public MongoDBRepositoryProductService getProductRepo() {
		return productRepo;
	}


	public void setProductRepo(MongoDBRepositoryProductService productRepo) {
		this.productRepo = productRepo;
	}

	@Override
	public List<ProductDTO> getAllProducts(){
		return productRepo.findAll();
	}

	@Override
	public String addProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return productRepo.create(productDTO).getId();
	}


	@Override
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		return productRepo.delete(id).getId();
	}
}
