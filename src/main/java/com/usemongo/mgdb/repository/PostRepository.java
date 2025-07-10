package com.usemongo.mgdb.repository;

import com.mongodb.client.result.UpdateResult;
import com.usemongo.mgdb.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {


    @Query("{ 'postId' : ?0 }")
    List<Post> findByThePersonsFirstname(int firstname);


    // Using @Query and @Update annotations for more complex updates
//    @Query("{ 'postId' : ?0 }")
//    @Update("{ '$set' : { 'title' : ?1 } }")
//    UpdateResult updateDocumentWithCustomQuery(int id, String newFieldValue);

//    @Update("{ '$inc' : { 'comments' : 1 } }")
//    long incrementValueById(String id);
}
