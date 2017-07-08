package com.organically4u.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.WriteConcernResolver;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.WriteConcern;
import com.organically4u.commons.constants.CommonConstants;

@Configuration
public class MongoConfigBean {
	
	@Autowired
	private Environment env;
	
	public @Bean Mongo mongo() throws Exception {
		MongoClientOptions.Builder optionsBuilder = new MongoClientOptions.Builder();
	    MongoClientOptions options = optionsBuilder.build();
        return new MongoClient(env.getProperty(CommonConstants.MONGO_HOST_KEY),options);
    }

    public @Bean MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "test");
    }
    
    @Bean
    public WriteConcernResolver writeConcernResolver() {
        return action -> {
            return WriteConcern.ACKNOWLEDGED;
        };
    }

}
