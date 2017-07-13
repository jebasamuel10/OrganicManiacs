package com.organically4u.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.organically4u.commons.constants.CommonConstants;

@Configuration
public class GridFSConfigBean extends AbstractMongoConfiguration{
	
	@Autowired
	private Environment env;
	@Autowired
	private MongoClient mongoClient;
	
	
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public MongoClient getMongoClient() {
		return mongoClient;
	}

	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

	public @Bean GridFsTemplate gridFsTemplate() throws Exception {
		 return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
	    }

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return env.getProperty(CommonConstants.MONGO_DBNAME_KEY);
	}

	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return mongoClient;
	}


}
