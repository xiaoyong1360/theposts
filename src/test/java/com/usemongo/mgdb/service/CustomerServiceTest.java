package com.usemongo.mgdb.service;

import com.usemongo.mgdb.model.Post;
import com.usemongo.mgdb.repository.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    @Mock
    private CustomerService customerService;

    @Spy
    private PostRepository postRepository;

    @BeforeEach
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAllbooks() {
        List<Post> all = postRepository.findAll();
        System.out.println("good");
    }

    @Test
    void update1() {
    }
}