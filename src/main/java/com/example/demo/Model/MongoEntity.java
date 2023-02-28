package com.example.demo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document(collection="user")
@Data
@AllArgsConstructor


public class MongoEntity {
	 @Id
	    private String id;
	    private String name;
	    private String description;

	    public MongoEntity() {
	    }

	    public MongoEntity(String name, String description) {
	        this.name = name;
	        this.description = description;
	    }

}
