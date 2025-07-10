package com.usemongo.mgdb.repository;

import com.usemongo.mgdb.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

    // Using @Query and @Update annotations for more complex updates
//    @Query("{ 'id' : ?0 }")
//    @Update("{ '$set' : { 'title' : ?1 } }")
//    UpdateResult updateDocumentWithCustomQuery(String id, String newFieldValue);
}
