package com.example.demo.Repo;

import com.example.demo.Model.MongoEntity;

public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<MongoEntity, String> {

}
