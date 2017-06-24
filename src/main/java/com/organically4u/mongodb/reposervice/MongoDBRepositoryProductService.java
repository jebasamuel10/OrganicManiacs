package com.organically4u.mongodb.reposervice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organically4u.model.Product;
import com.organically4u.model.dto.ProductDTO;
import com.organically4u.mongodb.repository.ProductRepository;

@Service
public class MongoDBRepositoryProductService implements MongoDBRepositoryService{

	private final ProductRepository repository;
	
	 @Autowired
	 MongoDBRepositoryProductService(ProductRepository repository) {
	        this.repository = repository;
	    }
	 @Override
	    public ProductDTO create(ProductDTO product) {
	        Product persisted = new Product(product.getProductName(), product.getProdShotDesc(), product.getProdLongDesc());
	        persisted = repository.save(persisted);
	        return convertToDTO(persisted);
	    }
	 @Override
	    public ProductDTO delete(String id) {
	        Product deleted = findProductById(id);
	        repository.delete(deleted);
	        return convertToDTO(deleted);
	    }
	 @Override
	    public List<ProductDTO> findAll() {
	        List<Product> ProductEntries = repository.findAll();
	        return convertToDTOs(ProductEntries);
	    }
	 
	    public List<ProductDTO> convertToDTOs(List<Product> models) {
	    	List<ProductDTO> productDTOList = new ArrayList();
	    	for (Product product : models) {
	    		productDTOList.add(convertToDTO(product));
			}
	    	return productDTOList;
	    }
	 
	    @Override
	    public ProductDTO findById(String id) {
	        Product found = findProductById(id);
	        return convertToDTO(found);
	    }
	 
	    @Override
	    public ProductDTO update(ProductDTO product) {
	        Product updated = findProductById(product.getId());
	        updated.setProductName(product.getProductName());
	        updated.setProductLongDesc(product.getProdLongDesc());
	        updated.setProductShortDesc(product.getProdShotDesc());
	        updated = repository.save(updated);
	        return convertToDTO(updated);
	    }
	 
	    private Product findProductById(String id) {
	        Product result = repository.findOne(id);
	        return result;
	 
	    }
	 
	    public ProductDTO convertToDTO(Product model) {
	        ProductDTO dto = new ProductDTO();
	 
	        dto.setId(model.getId());
	        dto.setProductName(model.getProductName());
	        dto.setProdLongDesc(model.getProductLongDesc());
	        dto.setProdShotDesc(model.getProductShortDesc());
	        return dto;
	    }
}
