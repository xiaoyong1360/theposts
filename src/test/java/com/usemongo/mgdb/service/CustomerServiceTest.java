package com.usemongo.mgdb.service;

import com.usemongo.mgdb.model.Post;
import com.usemongo.mgdb.repository.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private PostRepository postRepository;

    @BeforeEach
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAllbooks() {
//        List<Post> all = postRepository.findAll();
//        List<Post> byThePersonsFirstname = postRepository.findByThePersonsFirstname(12);
//        System.out.println(postRepository.count());

//        postRepository.updateDocumentWithCustomQuery(12, "title 2");
//        postRepository.incrementValueById("686fd4893707cac948878ba0");
//        System.out.println(postRepository.count());
//        //        Optional<Post> byId = postRepository.findById("686fd2eac1f06c3ec9c7c2ba");
//
//
//        byId.ifPresent(this::update1);

//        Post entity = new Post(null, "title 1", true, 12, 15);
//        postRepository.save(entity);
//        System.out.println("good");
    }

    void update1(Post b) {
        postRepository.deleteById(b.getId());
        b.setTitle("title 3");
        postRepository.save(b);
    }
    @Test
    void update1() {
        customerService.update1();
    }
}