package com.organically4u.resources;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.gridfs.GridFSDBFile;
import com.organically4u.exception.ProductException;
import com.organically4u.model.dto.CategoryDTO;
import com.organically4u.model.dto.ProductDTO;
import com.organically4u.service.ProductService;

import groovy.util.logging.Log;
import groovy.util.logging.Slf4j;

@Slf4j
@RestController
@RequestMapping("/get")
public class EnquiryResource {

	@Autowired
	ProductService productService;
	
	private static Logger log = LoggerFactory.getLogger(EnquiryResource.class);
	
	@RequestMapping(value="/AllProducts",method={RequestMethod.GET})
	@ResponseBody
	public ResponseEntity<List<ProductDTO>> getAllProduct() throws ProductException{
		log.debug("getAllProudct");
		return new ResponseEntity<List<ProductDTO>>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/AllProductName",method={RequestMethod.GET})
	@ResponseBody
	public ResponseEntity<List<String>> getAllProductName() throws ProductException{
		log.debug("getAllProudctName");
		return new ResponseEntity<List<String>>(productService.getAllProductName(), HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/AllCategories",method={RequestMethod.GET})
	@ResponseBody
	public ResponseEntity<List<CategoryDTO>> getAllCategory() throws ProductException{
		log.debug("getAllProudct");
		return new ResponseEntity<List<CategoryDTO>>(productService.getAllCategories(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/AllCategoriesName",method={RequestMethod.GET})
	@ResponseBody
	public ResponseEntity<List<String>> getAllCategoryName() throws ProductException{
		log.debug("getAllProudct");
		return new ResponseEntity<List<String>>(productService.getAllCategoryName(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getImage", method = RequestMethod.GET)
	public ResponseEntity getImage() throws IOException {
		GridFSDBFile gridFsFile = productService.retrieveProductImage();
	    return ResponseEntity.ok()
	            .contentLength(gridFsFile.getLength())
	            .contentType(MediaType.parseMediaType(gridFsFile.getContentType()))
	            .body(new InputStreamResource(gridFsFile.getInputStream()));
	    
	}
	
}
