	package com.organically4u.serviceimpl;
	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.InputStream;
	import java.util.ArrayList;
	import java.util.List;
	
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.mongodb.core.MongoTemplate;
	import org.springframework.data.mongodb.core.query.Criteria;
	import org.springframework.data.mongodb.core.query.Query;
	import org.springframework.data.mongodb.gridfs.GridFsTemplate;
	import org.springframework.stereotype.Service;
	
	import com.mongodb.BasicDBObject;
	import com.mongodb.WriteResult;
	import com.mongodb.gridfs.GridFSDBFile;
import com.organically4u.model.Categories;
import com.organically4u.model.Product;
import com.organically4u.model.dto.CategoryDTO;
import com.organically4u.model.dto.ProductDTO;
	import com.organically4u.service.ProductService;
	import com.organically4u.util.Converter;
	
	import groovy.util.logging.Slf4j;
	
	@Slf4j
	@Service
	public class ProductServiceImpl implements ProductService{
		
		private static Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
		
		@Autowired
		private MongoTemplate mongoTemplate;
		@Autowired
		private GridFsTemplate gridFsTemplate;
		@Autowired
		private Converter converter;
		
		
		
		
		// Posting
		
		
			@Override
			public String addProduct(ProductDTO productDTO) {
				// TODO Auto-generated method stub
				try {
					Product product = (Product)converter.convert(Product.class, productDTO );
					mongoTemplate.insert(product);
					return product.getId_product();
				}catch(Exception e) {
					e.printStackTrace();
					logger.error(e.toString());
					return null;
				}
			}
	
	
			@Override
			public String updateProductDetails(ProductDTO productDTO) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			@Override
			public String deleteProduct(String id) {
				// TODO Auto-generated method stub
				WriteResult writeResult = mongoTemplate.remove(getProduct(id));
				return writeResult.wasAcknowledged() ? id : null;
			}
			
			
			@Override
			public String addCategory(CategoryDTO categoryDTO) {
				try {
					Categories categories = (Categories)converter.convert(Categories.class, categoryDTO );
					mongoTemplate.insert(categories);
					return categories.getId_category();
				}catch(Exception e) {
					e.printStackTrace();
					logger.error(e.toString());
					return null;
				}
			}
			
			@Override
			public String updateCategory(String id) {
				// TODO Auto-generated method stub
				return null;
			}
	
	
			@Override
			public String deleteCategory(String id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			@Override
			public String addSourceFrom(ProductDTO productDTO) {
				try {
					Product product = (Product)converter.convert(Product.class, productDTO );
					mongoTemplate.insert(product);
					return product.getId_product();
				}catch(Exception e) {
					e.printStackTrace();
					logger.error(e.toString());
					return null;
				}
			}
	
			@Override
			public String updateSourceFrom(String id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String delteSourceFrom(String id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String addCustomer(ProductDTO productDTO) {
				try {
					Product product = (Product)converter.convert(Product.class, productDTO );
					mongoTemplate.insert(product);
					return product.getId_product();
				}catch(Exception e) {
					e.printStackTrace();
					logger.error(e.toString());
					return null;
				}
			}
	
			@Override
			public String updateCustomer(String id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String delteCustomer(String id) {
				// TODO Auto-generated method stub
				return null;
			}
		// Posting -End	
			
		
		
		//Enquiry - Start
		
		@Override
		public List<ProductDTO> getAllProducts(){
			
			List<Product> productlist = new ArrayList<Product>();
			List<ProductDTO> productDTOlist = new ArrayList<ProductDTO>();
			productlist.addAll(mongoTemplate.findAll(Product.class));
			for(Product product :productlist){
				productDTOlist.add((ProductDTO)converter.convert(ProductDTO.class, product ));
			}
			return productDTOlist;
		}
		
		@Override
		public List<String> getAllProductName(){
			
			List<Product> productlist = new ArrayList<Product>();
			List<String> productNameList = new ArrayList<String>();
			productlist.addAll(mongoTemplate.findAll(Product.class));
			for(Product product :productlist){
				productNameList.add(product.getProductName());
			}
			return productNameList;
		}
	
		@Override
		public List<CategoryDTO> getAllCategories() {
			List<Categories> categorylist = new ArrayList<Categories>();
			List<CategoryDTO> categoryDTOlist = new ArrayList<CategoryDTO>();
			categorylist.addAll(mongoTemplate.findAll(Categories.class));
			for(Categories category :categorylist){
				categoryDTOlist.add((CategoryDTO)converter.convert(CategoryDTO.class, category ));
			}
			return categoryDTOlist;
		}
	
		@Override
		public List<String> getAllCategoryName() {
			List<Categories> categorylist = new ArrayList<Categories>();
			List<String> categoryDTONamelist = new ArrayList<String>();
			categorylist.addAll(mongoTemplate.findAll(Categories.class));
			for(Categories category :categorylist){
				categoryDTONamelist.add(category.getCategoryName());
			}
			return categoryDTONamelist;
		}
		
		
		@Override
		public List<ProductDTO> getAllSrcfroms() {
			// TODO Auto-generated method stub
			return null;
		}
	
	
		@Override
		public ProductDTO getSrcfrom() {
			// TODO Auto-generated method stub
			return null;
		}
	
	
		@Override
		public ProductDTO getCategories() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Product getProduct(String id){
			Query query = new Query();
			query.addCriteria(Criteria.where("_id").is(id));
			return mongoTemplate.findOne(query,Product.class);
		}
		
		public String storeProductImage() throws FileNotFoundException {
			InputStream inputStream = new FileInputStream("src/main/resources/images/test.jpg"); 
			String id = gridFsTemplate.store(inputStream, "test.jpg", "image/jpg", new BasicDBObject("id","image1")).getId().toString();
			return id;
		}
		
		public GridFSDBFile retrieveProductImage() throws FileNotFoundException {
			String id = "5967b1094aabce03ac818d68";
			GridFSDBFile gridFsdbFile = gridFsTemplate.findOne(new Query(Criteria.where("_id").is(id)));
			return gridFsdbFile;
		}
		
	
	
	
		
		public GridFsTemplate getGridFsTemplate() {
			return gridFsTemplate;
		}
	
	
		public void setGridFsTemplate(GridFsTemplate gridFsTemplate) {
			this.gridFsTemplate = gridFsTemplate;
		}
	
	
		public MongoTemplate getMongoTemplate() {
			return mongoTemplate;
		}
	
	
		public void setMongoTemplate(MongoTemplate mongoTemplate) {
			this.mongoTemplate = mongoTemplate;
		}
		
	
	}
