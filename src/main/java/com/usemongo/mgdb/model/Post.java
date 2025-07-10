package com.usemongo.mgdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("posts")
@Data
@AllArgsConstructor
public class Post {

    @Id
    private String id;

    private String title;

    @Field("shared")
    private boolean sharedFlag;

    private int postId;

    private int comments;



}
