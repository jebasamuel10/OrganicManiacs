package com.organically4u.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mongodb.WriteResult;
import com.organically4u.dto.converter.ConvertToDTO;
import com.organically4u.model.Product;
import com.organically4u.model.converter.ConvertToModel;
import com.organically4u.model.dto.ProductDTO;
import com.organically4u.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	private static Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}


	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public List<ProductDTO> getAllProducts(){
		return ConvertToDTO.convertToDTOs(mongoTemplate.findAll(Product.class));
	}

	@Override
	public String addProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		try {
			Product product = ConvertToModel.convertToModel(productDTO);
			mongoTemplate.insert(product);
			return product.getId();
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(e.toString());
			return null;
		}
		}


	@Override
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		WriteResult writeResult = mongoTemplate.remove(getProduct(id));
		return writeResult.wasAcknowledged() ? id : null;
	}
	public Product getProduct(String id){
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		return mongoTemplate.findOne(query,Product.class);
	}
}
