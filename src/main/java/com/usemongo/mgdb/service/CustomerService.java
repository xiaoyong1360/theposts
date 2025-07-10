package com.usemongo.mgdb.service;

import com.usemongo.mgdb.model.Post;
import com.usemongo.mgdb.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final PostRepository postRepository;

    public CustomerService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllbooks(){
        return postRepository.findAll();
    }

    public String update1() {
//        UpdateResult updateResult = postRepository.updateDocumentWithCustomQuery(
//                "684af19c7c815540ee5832a7",
//                "What is the best way to learn JavaScript from the ground up?23");
        return "abc";
    }
}
