package com.usemongo.mgdb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("posts")
@Data
public class Post {

    @Id
    private String id;

    private String title;

    @Field("shared")
    private boolean sharedFlag;



}
