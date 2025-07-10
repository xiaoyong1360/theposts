package com.usemongo.mgdb.service;

import com.usemongo.mgdb.model.Post;
import com.usemongo.mgdb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import com.mongodb.client.result.UpdateResult;

@Service
public class CustomerService {

    private final PostRepository postRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Post saveUser(){
        Post post = new Post(null, "title 5", true, 50, 500);
        mongoTemplate.save(post);
        return post;
    }
    /*
    public User saveUser(User user) {
        return mongoTemplate.save(user);
    }
*/



    public CustomerService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllbooks(){
        return postRepository.findAll();
    }


    /*
    *
    *   @Autowired
        private MongoTemplate mongoTemplate;

        public User saveUser(User user) {
            return mongoTemplate.save(user);
        }

        public List<User> findAllUsers() {
            return mongoTemplate.findAll(User.class);
        }

        public User findUserByName(String name) {
            Query query = new Query(Criteria.where("name").is(name));
            return mongoTemplate.findOne(query, User.class);
        }

        public void deleteUserById(String id) {
            Query query = new Query(Criteria.where("id").is(id));
            mongoTemplate.remove(query, User.class);
        }
        * */


    public long updateProductPrice(int productId, int newPrice) {

//        BasicQuery query = new BasicQuery("{ id : { $lt : 50 }, accounts.balance : { $gt : 1000.00 }}");
//        BasicQuery query2 = new BasicQuery("{ postId : 50, author.name : 'Emily Watson'}");
//        List<Post> result2 = mongoTemplate.find(query2, Post.class);
//        System.out.println(result2.size());


        Query query = new Query(Criteria.where("postId").is(productId));
        Update update = new Update().set("comments", newPrice);

        UpdateResult result = mongoTemplate.updateFirst(query, update, Post.class);
        return result.getModifiedCount(); // Returns the number of modified documents
    }


    public String update1() {
//        saveUser();
        updateProductPrice(50, 505);
//        UpdateResult updateResult = postRepository.updateDocumentWithCustomQuery(
//                "684af19c7c815540ee5832a7",
//                "What is the best way to learn JavaScript from the ground up?23");
        return "abc";
    }
}
