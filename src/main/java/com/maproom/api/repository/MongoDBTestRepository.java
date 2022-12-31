package com.maproom.api.repository;

import com.maproom.api.domain.MongoDBTestModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MongoDBTestRepository extends MongoRepository<MongoDBTestModel, String> {
    MongoDBTestModel findByName(String name);
}
