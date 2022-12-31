package com.maproom.api.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@Document(collection = "test_user")
public class MongoDBTestModel {

    private String name;
    private int age;
    private String id;
}
